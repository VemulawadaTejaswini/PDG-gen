import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ2400().doIt();
	}
	
	class AOJ2400{
		int T,P,R;
		
		void solve(){
			Team[] team = new Team[T];
			for(int i=0;i<T;i++)team[i]=new Team(i+1);
			for(int i=0;i<R;i++){
				 int teamId = in.nextInt();
				 int problemId = in.nextInt();
				 int time = in.nextInt();
				 String message = in.next();
				 team[teamId-1].submit(problemId, time, message);
			}
			Arrays.sort(team);
			for(int i=T-1;i>=0;i--){
				System.out.println(team[i].id+" "+team[i].currect+" "+team[i].point);
			}
			
			
		}
		
		void doIt(){
			while(in.hasNext()){
				T = in.nextInt();
				P = in.nextInt();
				R = in.nextInt();
				if(P+R+T==0)break;
				solve();
			}
		}
		
		class Team implements Comparable<Team>{
			int id;
			boolean[] solved;
			int fail[];
			int point;
			int currect;//正解した数;
			public Team(int id){
				this.id = id;
				solved = new boolean[P+1];
				fail = new int[P+1];
				point = 0; 			
			}
			
			void submit(int problem,int time,String message){
				if(solved[problem])return;
				if(message.equals("CORRECT")){
					point+=(fail[problem]*1200+time);
					solved[problem]=true;
					currect++;
				}else{
					fail[problem]++;
				}
			}

			public int compareTo(Team o) {
				if(this.currect>o.currect)return 1;
				else if(this.currect<o.currect)return -1;
				else if(this.point<o.point)return 1;
				else if(this.point>o.point)return -1;
				else if(this.id<o.id)return 1;
				else if(this.id>o.id)return -1;
				return 0;
			}
			
		}
		
	}
	
}