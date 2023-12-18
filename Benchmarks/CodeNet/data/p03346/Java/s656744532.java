import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0 ; i< n ; i++) {
			d[i] = sc.nextInt();
		}
		int cnt = 1;
		for (int i = 0 ; i < n ; i++) {
			int a = 0;
			int b = d[i];
			for (int j = i + 1 ; j < n ; j++) {
				if (b == d[j] - 1) {
					a++;
					b++;
				}
			}
			if (cnt < a) {
				cnt = a;
			}
		}
		System.out.println(n - cnt);
	}
}