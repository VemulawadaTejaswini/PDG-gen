import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1186().doIt();
	}
	
	class AOJ1186{
		void doIt(){
			ArrayList<Data> list = new ArrayList<Data>();
			for(int h=1;h<=160;h++)for(int w=h+1;w<=160;w++)list.add(new Data(h, w));
			Collections.sort(list);
			while(in.hasNext()){
				int h = in.nextInt();
				int w = in.nextInt();
				if(h+w==0)break;
				for(int i=0;i<list.size();i++){
					if(list.get(i).h==h&&list.get(i).w==w){
						System.out.println(list.get(i-1).h+" "+list.get(i-1).w);break;
					}
				}
			}
		}
		
		class Data implements Comparable<Data>{
			int h,w;
			public Data(int h,int w){
				this.w = w;
				this.h = h;
			}
			public int compareTo(Data o) {
				if(w*w+h*h<o.w*o.w+o.h*o.h)return 1;
				else if(w*w+h*h>o.w*o.w+o.h*o.h)return -1;
				else if(this.h < o.h)return 1;
				else if(this.h > o.h)return -1;
				return 0;
			}
		}
		
	}
	
}