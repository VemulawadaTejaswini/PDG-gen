import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		
		long ans = 0;
		for (int k = 1; k <= N; k++) {
			ans += k * sum(N / k);
		}
		
		System.out.println(ans);
	}
	
	public static long sum(int N) {
		return (long) N * (N + 1) / 2;
	}
}
