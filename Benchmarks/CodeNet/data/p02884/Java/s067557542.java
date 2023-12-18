import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	List<Integer>[] to;
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		to = new ArrayList[N];
		for (int i = 0; i < N; i++)
			to[i] = new ArrayList<Integer>();
		
		M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			to[s].add(t);
		}
		double min = Double.MAX_VALUE;
		// expected value
		double[] ev = new double[N];
		for (int i = 0; i < N-1; i++) {
			for (int j = N-2; j >= 0; j--) {
				double sum = 0d;
				double max = -Double.MAX_VALUE;
				for (int v : to[j]) {
					sum += ev[v]+1;
					max = Math.max(max, ev[v]);
				}
				int c = to[j].size();
				if (i == j && c > 1) ev[j] = (sum-max-1) / (c-1);
				else ev[j] = sum / c;
			}
			min = Math.min(min, ev[0]);
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
