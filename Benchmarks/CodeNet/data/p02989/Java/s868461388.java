import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] d = new long[N];
		
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextLong();
		}
		
		Arrays.sort(d);
		
		if(d[N / 2 - 1] == d[N / 2]) {
			System.out.println(0);
			return;
		}
		
		long ans = d[N / 2] - d[N / 2 - 1];
		
		System.out.println(ans);
	}
}
