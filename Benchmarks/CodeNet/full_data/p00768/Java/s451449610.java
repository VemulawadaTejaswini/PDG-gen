import java.awt.geom.Point2D;
import java.util.*;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {

		new AOJ1187();
		
	}

	class AOJ1187{
		int all_time,all_team,all_problem,all_submit;
		public AOJ1187() {
			while(true){
				all_time = in.nextInt();
				all_team = in.nextInt();
				all_problem = in.nextInt();
				all_submit = in.nextInt();
				ArrayList<AOJTeam> list = new ArrayList<AOJTeam>();
				
				for(int i=0;i<all_team;i++)list.add(new AOJTeam(i));
				
				if(all_time+all_team+all_problem+all_submit==0)break;
				for(int i=0;i<all_submit;i++){
					int m = in.nextInt(),t = in.nextInt(),p = in.nextInt(),j = in.nextInt();
					list.get(t-1).doIt(m, p, j);
				}
				Collections.sort(list);
				
//				for(int i=0;i<list.size();i++)System.out.println(list.get(i));
				System.out.print(list.get(0).num);
				for(int i=1;i<list.size();i++){
					if(list.get(i-1).accept==list.get(i).accept&&
							list.get(i-1).time==list.get(i).time)System.out.print("=");
					else System.out.print(",");
					System.out.print(list.get(i).num);
				}
				System.out.println();
			}
		}
		
		class AOJTeam implements Comparable<AOJTeam>{
			int time;//過ぎた時間
			int num;//チーム番号
			int accept;//正解数
			int[] cnt;//不正解した回数をカウント
			public AOJTeam(int t){//初めて呼び出される
				time = 0;
				num = t+1;
				accept = 0;
				cnt = new int[all_problem+1];
			}
			
			void doIt(int m,int p,int j){//経過時間,問題番号,判定結果
				if(j==0){//AC
					time+=cnt[p]*20+m;
					accept++;
				}else{//WA
					cnt[p]++;
				}
			}
			
			public String toString(){
				return "num= "+num+" "+accept;
			}

			public int compareTo(AOJTeam o) {
				if(this.accept>o.accept)return -1;
				else if(this.accept<o.accept)return 1;
				else if(this.time<o.time)return -1;
				else if(this.time>o.time)return 1;
				else if(this.num>o.num)return -1;
				else if(this.num<o.num)return 1;
				return 0;
			}
		}
	}

	class problem_A{
		public problem_A() {
			//			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] list = new int[n];
			for(int i=0;i<n;i++)list[i] = in.nextInt();
			Arrays.sort(list);

		}
	}


}