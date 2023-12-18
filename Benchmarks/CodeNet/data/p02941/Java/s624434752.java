import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}
		PriorityQueue<Pair> q = new PriorityQueue<>();
		for(int i = 0; i < n; i++){
			B[i] = sc.nextInt();
			q.add(new Pair(i, B[i]));
		}
		long res = 0;
		while(!q.isEmpty()){
			Pair p = q.remove();
			int u = p.ind;
			if(B[(u+1)%n] + B[(u+n-1)%n] >= B[u]){
				System.out.println("-1"); return;
			}
			res += (long)(B[u] / (B[(u+1)%n] + B[(u+n-1)%n]));
			B[u] %= (B[(u+1)%n] + B[(u+n-1)%n]);
			if(B[u] != A[u]){
				q.add(new Pair(u, B[u]));
			}
		}
		System.out.println(res);
	}
	static class Pair implements Comparable<Pair>{
		int ind, val;
		public Pair(int ind, int val){
			this.ind = ind; this.val = val;
		}
		@Override
		public int compareTo(Pair arg0) {
			return -val+arg0.val;
		}
	}

}
