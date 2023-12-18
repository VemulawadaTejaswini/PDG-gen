import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arrA = new long[n + 1];
		long[] arrB = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    arrA[i] = x + arrA[i - 1];
		    if (x < 0) {
		        x = 0;
		    }
		    arrB[i] = x + arrB[i - 1];
		}
		long max = Long.MIN_VALUE;
		for (int i = 1; i + k - 1 <= n; i++) {
		    max = Math.max(max, arrB[n] - (arrB[i + k - 1] - arrB[i - 1]));
		    max = Math.max(max, arrB[n] - (arrB[i + k - 1] - arrB[i - 1]) + arrA[i + k - 1] - arrA[i - 1]);
		}
		System.out.println(max);
   }
}


