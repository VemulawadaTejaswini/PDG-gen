import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		for(int i = 0; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		long[] prefix = new long[N + 1];
		prefix[0] = 1;
		int len = 1;
		long left = len - arr[0];
		boolean invalid = false;
		for(int i = 1; i <= N; i++) {
			if(left < 0) {
				invalid = true;
				break;
			}
			len = N < 32 ? len * 2 : Integer.MAX_VALUE;
			prefix[i] = Math.min(left * 2, len);
			left = prefix[i] - arr[i];
		}
		if(left < 0)
			invalid = true;
		if(!invalid) {
			long sum = 0;
			long next = 0;
			for(int i = N; i >= 0; i--) {
				next += arr[i];
				sum += Math.min(prefix[i], next);
			}
			System.out.println(sum);
		}
		else
			System.out.println(-1);
	}
}