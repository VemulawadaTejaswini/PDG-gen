import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static Scanner scanner;
	
	 Main (){
		int N = scanner.nextInt();
		pair[] job = new pair[N];
		for(int i = 0; i<N; i++){
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			job[i] = new pair(s,t);
		}
		System.out.println( solve(N, job) );
	}
	
	int solve(int N, pair[] job){
		int ans = 0, t = 0; //最後に選んだjobの修了時刻(0<修了時刻, 0<開始時刻)
		Arrays.sort(job); //修了時刻でソート
		for(int i=0; i<N; i++){
			if( t < job[i].s ){ //最後に選んだjobの修了時刻 < 次に選ぶjobの開始時刻
				ans++;
				t = job[i].t;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		new  Main ();
	}

}

class pair implements Comparable{
	int s,t;
	pair(int s, int t){ this.s = s; this.t = t; }
	public int compareTo(Object ob){ return this.t - ((pair)ob).t; }
}


