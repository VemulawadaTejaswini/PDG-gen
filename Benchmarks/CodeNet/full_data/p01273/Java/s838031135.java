
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		new Main().start();
	}

	class Log implements Comparable<Log>{
		long t;
		int from;
		int to;

		Log(long t,int from,int to){
			this.t = t;
			this.from = from;
			this.to = to;
		}

		public int compareTo(Log o) {
			return (int) (this.t - o.t);
		}
	}

	private void start() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean infected[] = new boolean[n];
		infected[0] = true;

		Log logs[] = new Log[m];

		for(int i=0; i<m; i++){
			long t = sc.nextLong();
			int from = sc.nextInt() -1;
			int to = sc.nextInt() -1;
			logs[i] = new Log(t,from,to);
		}

		Arrays.sort(logs);


		for(int i=0; i<m; i++)
			if(infected[logs[i].from])
				infected[logs[i].to] = true;

		int count = 0;
		for(int i=0; i<n; i++)
			if(infected[i])
				count++;

		System.out.println(count);
	}

}