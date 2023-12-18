import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextLong();
		} 
		long ans = Long.MAX_VALUE;
		for (long test = -100; test <= 100; test++) {
			long curans = 0;
			for (int i = 0; i < N; i++) {
				long diff = test-arr[i];
				curans+=diff*diff;
			}
			ans=Math.min(ans, curans);
		}
		System.out.println(ans);
	}
}