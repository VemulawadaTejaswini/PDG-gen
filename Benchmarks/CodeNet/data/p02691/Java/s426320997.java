import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] H = new long[N+1];
		long cnt = 0;
		long max = 0;
		for (int i = 1; i <= N; i++) {
			H[i] = input.nextLong();
			max = Math.max(H[i], max);
		}
		//Try O(N^2) Brute Force first
		for (int i = 1; i <= N; i++) {
			if (H[i]+i+1<=N) {
				int S = (int)(H[i]+i+1);
				//System.out.println(S);
				for (int j = S; j <= N; j++) {
					if (j-i==H[i]+H[j]) cnt++;
					if (j-i>max+H[i]) break;
				}
			}
		}
		System.out.println(cnt);
	}
}