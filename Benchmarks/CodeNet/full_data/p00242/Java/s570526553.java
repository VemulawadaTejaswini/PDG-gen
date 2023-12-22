import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a;
		while(true){
			a=s.nextInt();
			if(a==0)System.exit(0);
			s.nextLine();
			String c="";
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			String wolf[]=new String[100000];
			int ind=0;
			for(int i=0;i<a;i++){
				String b=s.nextLine();
				String[]d=b.split(" ");
				for(int j=0;j<d.length;j++){
					if(map.containsKey(d[j])){
						map.put(d[j],map.get(d[j])+1);
					}else{
						map.put(d[j],1);
						wolf[ind++]=d[j];
					}
				}
			}
			Arrays.sort(wolf,0,ind);
			String p=s.next();
			int count=0;
			for(int i=5;i>0;i--){
				if(count==5)break;
				for(int j=0;j<ind;j++){
					if(count==5)break;
					if(p.charAt(0)==wolf[j].charAt(0)&&map.get(wolf[j])==i){
						if(count>0)System.out.print(" ");
						System.out.print(wolf[j]);
						count++;
					}
				}
			}
			if(count==0)System.out.println("NA");
			else System.out.println();
		}
	}
}