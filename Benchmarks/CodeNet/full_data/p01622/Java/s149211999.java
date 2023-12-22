import java.util.*;
import java.awt.geom.*;

public class Main{
	int INF = 1 << 29;
	
	class C implements Comparable<C>{
		int read, write;

		public C(int read, int write) {
			this.read = read;
			this.write = write;
		}

		@Override
		public int compareTo(C arg0) {
			return arg0.read - this.read;
		}

		@Override
		public String toString() {
			return "C [read=" + read + ", write=" + write + "]";
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			C [] data = new C[n];
			int sumRead = 0, sumWrite = 0;
			for(int i = 0; i < n; i++){
				int read = sc.nextInt();
				int write = sc.nextInt();
				data[i] = new C(read, write);
				sumRead += read;
				sumWrite += write;
			}
			Arrays.sort(data);
			if(data[0].read > sumRead - data[0].read){
				int restTime = data[0].read - (sumRead - data[0].read);
				boolean [] dp = new boolean[restTime + 1];
				dp[0] = true;
				for(int i = 1; i < n; i++){
					for(int j = restTime; j >= 0 ; j--){
						if(! dp[j]) continue;
						int next = j + data[i].write;
						if(next > restTime) continue;
						dp[next] = true;
					}
				}
				
				int ind = -1;
				for(int i = 0; i <= restTime; i++){
					if(dp[i]){
						ind = i;
					}
				}
				System.out.println(sumRead + sumWrite + (restTime - ind));
			}
			else{
				System.out.println(sumRead + sumWrite);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}