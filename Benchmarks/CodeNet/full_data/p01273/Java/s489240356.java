import java.util.*;

public class Main{
	class C implements Comparable<C>{
		int t,from, to;

		public C(int t, int from, int to) {
			this.t = t;
			this.from = from;
			this.to = to;
		}

		@Override
		public int compareTo(C o) {
			return this.t - o.t;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			C [] data = new C[m];
			for(int i = 0; i < m; i++){
				int t = sc.nextInt();
				int from = sc.nextInt()-1;
				int to = sc.nextInt()-1;
				data[i] = new C(t, from, to);
			}
			Arrays.sort(data);
			boolean [] isV = new boolean[n];
			isV[0] = true;
			for(int i = 0; i < m; i++){
				if(isV[data[i].from]){
					isV[data[i].to] = true;
				}
			}
			int count = 0;
			for(int i = 0; i < n; i++){
				if(isV[i]) count++;
			}
			
			System.out.println(count);
		}
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}