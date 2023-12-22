import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int Q = stdIn.nextInt();
		int[] a = new int[Q];
		int[] b = new int[Q];
		int[] c = new int[Q];
		int[] d = new int[Q];
		
		for(int i = 0; i < Q; i ++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
			c[i] = stdIn.nextInt();
			d[i] = stdIn.nextInt();
		}
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		
		System.out.println(dfs(A, a, b, c, d, N, M));
	}
	
	public static long dfs(ArrayList<Integer> A, int[] a, int[] b, int[] c, int[] d, int N, int M) {
		long ans = 0;
		if(A.size() == N + 1) {
			return calc(A, a, b, c, d, N);
		}else {
			int i = A.get(A.size() - 1);	
			while(i <= M) {
				A.add(i ++);
				ans = Math.max(ans, dfs(A, a, b, c, d, N, M));
				A.remove(A.size() - 1);
			}
			return ans;
		}
	}
	
	public static long calc(ArrayList<Integer> A, int[] a, int[] b, int[] c, int[] d, int N) {
		long score = 0;
		for(int i = 0; i < a.length; i ++) {
			if(A.get(b[i]) - A.get(a[i]) == c[i]) {
				score += d[i];
			}
		}
		return score;
	}

}