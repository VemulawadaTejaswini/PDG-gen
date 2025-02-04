import java.util.*;

public class Main {
	static boolean[] list;
	static HashMap<String,Integer> daylist;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			int t = sc.nextInt();
			String week = sc.next();
			String time = sc.next();
			int p = sc.nextInt();
			int m = sc.nextInt();

			list=new boolean[7*24*60];
			
			for(int e=0;e<list.length;e++)list[e]=false;
			
			daylist=new HashMap<String,Integer>();
			ArrayList<String> name=new ArrayList<String>();
			name.add("Sun");
			daylist.put(name.get(0), 0);
			
			name.add("Mon");
			daylist.put(name.get(1), 1*24*60);
			
			name.add("Tue");
			daylist.put(name.get(2), 2*24*60);
		
			name.add("Wed");
			daylist.put(name.get(3), 3*24*60);
			
			name.add("Thu");
			daylist.put(name.get(4), 4*24*60);
			
			name.add("Fri");
			daylist.put(name.get(5), 5*24*60);
			
			name.add("Sat");
			daylist.put(name.get(6), 6*24*60);		
			
			if (s == 0 && n == 0 && t == 0 && p == 0 && m == 0 && week.equals("None") && time.equals("None"))break;		
			
			if(week.equals("All")){
			//	for(int i=0;i<name.size();i++){
					set(time);
			//	}
			}else {
				set(week,time);
			}
			
			int aroundable=0;
			
			System.out.print(list[0]==true?"T":"F");
			for(int u=1;u<list.length;u++){
				System.out.print(list[u]==true?"T":"F");
				if(u%1440==0)System.out.println();
				if(u%360==0)System.out.println();
			}
			
			int i=0;
			while(true){
				int count=0;
					
			//	System.out.println(list[i]);
		//		if(list[i]&&list[i+s]){
				int sub=i+s;
				if(sub>=7*24*60)sub-=7*24*60;
				if(list[i]&&list[sub])count++;
					int here=i+t;
			
					for(int j=1;j<m;j++){
						if(here>=7*24*60)here-=7*24*60;
						sub=here+s;
						if(sub>=7*24*60)sub-=7*24*60;
						if(list[here]&&list[sub])count++;
						here+=t;
					}
					System.out.println(count);
					aroundable=Math.max(aroundable, count);
			//		System.out.println(aroundable);
			//	}
				
				i++;
				if(i==7*24*60)break;
			}

	//		System.out.println(p+" "+n);
			double result=1.0-(1.0/p);
			result=result==0?result=1:result;
		//	System.out.println(result);
			
			
			
			System.out.println(aroundable);
			result=1-Math.pow(result,aroundable*n);
			result=result==0&&!(time.equals("Night")&&(double)s/60.0>6)?result=1:result;
	//		System.out.println(result);
			
			System.out.printf("%.10f\n",result);
			
			System.out.print(list[0]==true?"T":"F");
			for(int u=1;u<list.length;u++){
				System.out.print(list[u]==true?"T":"F");
				if(u%1440==0)System.out.println();
				if(u%360==0)System.out.println();
			}
			
			
		}
	}
	
	public static void set(String str){
		if(str.equals("Day"))setset(-1,6,18);
		else if(str.equals("Night")){
			setset(-1,0,6);
			setset(-1,18,24);
		}else setset(-1,0,24);
		
	}
	public static void set(String strw,String strt){
//		System.out.println(strw+" "+strt);
		if(strt.equals("Day"))setset(daylist.get(strw),6,18);
		else if(strt.equals("Night")){

			setset(daylist.get(strw),0,6);
			setset(daylist.get(strw),18,24);
		}else setset(daylist.get(strw),0,24);
	}
	public static void setset(int num,int start,int end){
		int sa=end-start;
		
		if(num==-1){

			int start2=start*60;
			int end2=sa*60+start2;
			for(int j=start2;j<=end2;j++){
				System.out.println(j);
				list[j]=true;
			}
		
			if(start==0)start=24;			
			for(int i=1;i<daylist.size();i++){			
				start2=i*start*60;
				end2=sa*60+start2;
				for(int j=start2;j<=end2;j++){
					System.out.println(j);
					list[j]=true;
				}
				
			}
		}else {
			
			start=num+start*60;
			end=sa*60+start;
		
			for(int i=start;i<=end;i++)list[i]=true;

		}
	}
}