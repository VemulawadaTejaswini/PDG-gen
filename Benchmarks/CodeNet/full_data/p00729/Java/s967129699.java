import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AO1148().doIt();
	}
	
	class AO1148{
		int pc,student;
		
		void solve(){
			Data data[] = new Data[student+1];
			int dm = in.nextInt();
			boolean used[] = new boolean[student+1];
			for(int i=0;i<dm;i++){
				int t = in.nextInt();
				int n = in.nextInt();
				int m = in.nextInt();
				int s = in.nextInt();
				if(used[m]==false){
					data[m] = new Data(t, n, m, s);
					used[m] = true;
				}else{
					if(s==1)data[m].logIn(t);
					else if(s==0)data[m].logOut(t);
				}
			}
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				int start = in.nextInt();
				int end = in.nextInt();
				int target = in.nextInt();
				if(used[target])System.out.println(data[target].whatTime(start, end));
				else System.out.println("0");
//				data[target].print();
			}
		}
		
		void doIt(){
			while(in.hasNext()){
				pc = in.nextInt();
				student = in.nextInt();
				if(pc+student==0)break;
				solve();
			}
		}
		class Data{
			boolean[] time;
			int before;
			int pc;
			public Data(int t,int n,int m,int s){
				time = new boolean[1261];
				before = -1;
				pc = 0;
				logIn(t);
			}
			
			int whatTime(int start ,int end){
				int result = 0;
				for(int i=start;i<end;i++)if(time[i])result++;
				return result;
			}
			
			void logIn(int t){
				if(before == -1)before = t;
				pc++;
			}
			
			void logOut(int t){
				pc--;
				if(pc==0){
					for(int i=before;i<t;i++)time[i] = true;
					before = -1;
				}
			}
			
			void print(){
				for(int i=0;i<=1260;i++)if(time[i])System.out.println(i);
			}
			
		}
	}
}