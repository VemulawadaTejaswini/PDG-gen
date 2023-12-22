import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int MAX = 1000;
	static int VMAX = 10000;
	
	static int s;
	static int[] A = new int[MAX];
	static int[] B = new int[MAX];
	static int[] T = new int[VMAX + 1];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = VMAX;
		for (int i=0; i<n; i++){
			A[i] = sc.nextInt();
			s = Math.min(s, A[i]);
		}
		int ans = solve(n);
		System.out.println(ans);
	}
	
	static int solve(int n){
		int ans = 0;
		
		int[] V = new int[MAX];
		for(int i=0; i<n; i++){
			B[i] = A[i];
			V[i] = 1;
		}
		Arrays.sort(B, 0, n);
		for(int i=0; i<n; i++) T[B[i]] = i;
		for(int i=0; i<n; i++){
			if (V[i] == 0) continue;
			int cur = i;
			int S = 0;
			int  m = VMAX;
			int an = 0;
			for (;;) {
				V[cur] = 0;
				an++;
				int v = A[cur];
				m = Math.min(m,v);
				S += v;
				cur = T[v];
				if (V[cur] == 0) break;
			}
			ans += Math.min(S + (an - 2) * m, m + S + (an + 1) * s);
		}
		return ans;
	}
}
