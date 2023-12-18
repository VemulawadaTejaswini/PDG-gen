import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0;
		
		if (Math.floor(Math.sqrt(N)) * Math.floor(Math.sqrt(N)) == N) {
			ans = (long)((Math.sqrt(N) - 1) + (Math.sqrt(N) - 1));
		} else if (N % 3 == 0) {
			ans = N / 3 + 1;
		} else if (N % 2 == 0) {
			ans = N / 2;
		} else if (N % 2 != 0) {
			ans = N - 1;
		}
		
		System.out.println(ans);
	}
}