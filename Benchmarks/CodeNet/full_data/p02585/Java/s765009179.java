import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		long[] c = new long[n];
		
		Arrays.setAll(p, i -> sc.nextInt() - 1);
		Arrays.setAll(c, i -> sc.nextLong());
		
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int pos = i;
			
			int mv = 0;
			long[] scr = new long[n + 1];
			
			boolean[] visited = new boolean[n];
			pos = p[pos];
			
			while (!visited[pos]) {
				mv++;
				visited[pos] = true;
				scr[mv] = scr[mv - 1] + c[pos];
				
				pos = p[pos];
			}
			
			if (mv >= k) {
				max = Math.max(max, getMaxScr(scr, 1, k));
			} else if (scr[mv] < 0) {
				max = Math.max(max, getMaxScr(scr, 1, mv));
			} else {
				max = Math.max(max, k / mv * scr[mv] + getMaxScr(scr, 0, k % mv));
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
	
	static long getMaxScr(long[] scr, int start, int last) {
		long max = Long.MIN_VALUE;
		for (int i = start; i <= last; i++)
			max = Math.max(max, scr[i]);
		return max;
	}
	
}


