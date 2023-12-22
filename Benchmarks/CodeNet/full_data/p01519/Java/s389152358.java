import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	
	public final static int MOD = 1000003;
	public static int N;
	public static int[] A = new int[50000+2];
	public static int[] B = new int[50000];
	public static HashMap<Integer,Long> hm = new HashMap<Integer,Long>();
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);

			String[] param;
			int i, M, a, b, c, n;
			long[] AB = new long[50000];
			while (true) {
				param = br.readLine().split(" ");
				N = Integer.parseInt(param[0]);
				M = Integer.parseInt(param[1]);
				if (N==0 && M==0) break;
				if ((N&1) == 1) {
					for (i = 0; i < M; i++) br.readLine();
					pw.println(0);
				} else {
					for (n = 0, i = 0; i < M; i++) {
						param = br.readLine().split(" ");
						a = Integer.parseInt(param[0]);
						b = Integer.parseInt(param[1]);
						if ((a+b&1)==1) AB[n++] = ((long)Math.min(a, b)<<16)|(Math.max(a, b));
					}
					Arrays.sort(AB, 0, n);
					for (c = 0, i = 0; i < n; i++) {
						B[i] = (int)(AB[i]&65535);
						a = (int)(AB[i]>>>16);
						if (c < a) {
							for (c = c+1; c < a; c++) A[c] = i;
							A[c] = i;
						}
					}
					for (c = c+1; c < N+2; c++) A[c] = n;
					pw.println(analyze());
				}
			}

			pw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public static long analyze() {
		hm.clear();
		long answer = 2;
		for (int i = 1; i < N; i++) {
			for (int j = A[i]; j < A[i+1]; j++) {
				answer = (answer + (1 + check(i+1, B[j]-1)) * (1 + check(B[j]+1, N))) % MOD;
			}
		}
		return answer;
	}
	
	public static long check(int X, int Y) {
		if (X >= Y) return 0;
		Long memo = hm.get((X<<16)|Y);
		if (memo != null) return memo.longValue(); 
		long answer = 0;
		for (int i = X; i < Y; i+=2) {
			for (int j = A[i]; j < A[i+1]; j++) {
				if (B[j]>Y) break;
				answer = (answer + (1 + check(i+1, B[j]-1)) * (1 + check(B[j]+1, Y))) % MOD;
			}
		}
		hm.put((X<<16)|Y, answer);
		return answer;
	}
}