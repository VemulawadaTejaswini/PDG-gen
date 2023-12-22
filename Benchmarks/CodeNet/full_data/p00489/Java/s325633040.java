import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0655().doIt();
	}
	
	class AOJ0655{
		void doIt(){
			int n = in.nextInt();
			Team team[] = new Team[n];
			for(int i=0;i<n;i++)team[i] = new Team();
			int limit = (n*n-n)/2;
			for(int i=0;i<limit;i++){
				int a = in.nextInt(),b = in.nextInt();
				int c = in.nextInt(),d = in.nextInt();
				if(c>d)team[a-1].win+=3;
				else if(c<d)team[b-1].win+=3;
				else{
					team[a-1].win++;
					team[b-1].win++;
				}
			}
			int result[] = new int[n];
			//自分より上に何人いるか数える
			for(int i=0;i<n;i++){
				int cnt = 1;
				for(int s=0;s<n;s++)if(team[i].win<team[s].win)cnt++;
				result[i] = cnt;
			}
			for(int i=0;i<n;i++)System.out.println(result[i]);
		}
		class Team{
			int win;
			public Team() {
				this.win=0;
			}
		}
	}
}