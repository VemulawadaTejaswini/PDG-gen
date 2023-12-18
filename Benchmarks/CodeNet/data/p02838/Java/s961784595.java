import java.util.*;
public class Main {

	public static void main(String[] args) {
		long m = 1000000007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] A = new String[N];
		Arrays.setAll(A, i -> Long.toBinaryString(sc.nextLong()));
		long ans = 0;
		long[] digit = new long[60];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < A[i].length(); j++) {
				if(A[i].charAt(A[i].length()-1-j) == '1')
					digit[j]++;
			}
		}
		for(int i = 0; i < 60; i++)
			ans += Math.pow(2, i) % m * digit[i] % m * (N-digit[i]) % m;
		System.out.println(ans % m);

	}

}