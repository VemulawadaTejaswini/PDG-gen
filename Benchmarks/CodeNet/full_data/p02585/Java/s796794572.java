import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		int[] C = new int[N];
		
		for(int i=0; i<N; i++)
			P[i] = sc.nextInt()-1;
		for(int i=0; i<N; i++)
			C[i] = sc.nextInt();
		
		boolean[] visited = new boolean[N];
		
		long ans = Long.MIN_VALUE;
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				ArrayList<Integer> list = new ArrayList<>();
				int cur = i;
				while(!visited[cur]) {
					list.add(C[cur]);
					visited[cur] = true;
					cur = P[cur];
				}
				ans = max(ans, solve(list, K));
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
	static long solve(ArrayList<Integer> list, int K) {
		int L = list.size();
		long[] score = new long[L+L+1];
		for(int i=0; i<L+L; i++) {
			score[i+1] = score[i] + list.get(i%L);
		}
		
		long ans = Long.MIN_VALUE;
		for(int i=0; i<L; i++) {
			for(int j=1; j<=min(K, L); j++) {
				long sum = score[i+j] - score[i];
				if(score[L]>0) {
					sum += (K-j)/L*score[L];
				}
				ans = Math.max(ans, sum);
			}
		}
		
		return ans;
    }
}
