import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] arr = new long[N];
		long ans = 1;
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextLong();
		}
		ans*=arr[0];
		for (int i = 1; i < N; i++) {
			long curGCD = GCD(ans,arr[i]);
			arr[i]/=curGCD; //Trying to avoid overflow
			ans*=arr[i];
		}
		System.out.println(ans);
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a, b);
		return GCD(Math.max(a, b)%Math.min(a, b),Math.min(a, b));
	}
}