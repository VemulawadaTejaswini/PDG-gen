import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		sc.close();
		long ans = 2020;
		if (R - L >= 2018) {
			ans = 0;
		} else {
			for (long i = L; i <= R - 1; i++) {
				for (long j = i + 1; j <= R; j++) {
					ans = Math.min(ans, (i % 2019) * (j % 2019));
				}
			}
		}
		System.out.println(ans);
	}
}
