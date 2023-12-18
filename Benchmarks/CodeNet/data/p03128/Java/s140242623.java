import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int[] c = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		String[] dp = new String[10000 + 10];
		Arrays.fill(dp, "0");
		for(int i = 0; i < M; i++) {
			if(dp[c[A[i]]].equals("0")) {
				dp[c[A[i]]] = Integer.toString(A[i]);
			}else {
				String t = dp[c[A[i]]];
				if(t.compareTo(Integer.toString(A[i])) > 0) {
					dp[c[A[i]]] = Integer.toString(A[i]);
				}
			}
		}

		for(int i = 0; i < N; i++) {
			String t = dp[i];
			if(!t.equals("0")) {
				for(int j = 0; j < M; j++) {
					String k = dp[i + c[A[j]]];
					String k1 = t + Integer.toString(A[j]);
					if(k.equals("0")) {
						dp[i + c[A[j]]] = k1;
					}else {
						if(k.length() < k1.length()) {
							dp[i + c[A[j]]] = k1;
						}else {
							if(k.compareTo(k1) > 0) {
								dp[i + c[A[j]]] = k1;
							}
						}
					}
				}
			}
		}
		//System.out.println(dp[N]);
		String[] t = new String[dp[N].length()];
		for(int i = 0; i < t.length; i++) {
			t[i] = dp[N].substring(i, i + 1);
		}
		Arrays.sort(t, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(String i : t) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
}