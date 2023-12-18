import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		double total = 0;
		int cnt, tmp;
		for (int i = 1; i <= n; i++) {
			cnt = 0;
			tmp = i;
			while (tmp <= k - 1) {
				tmp = tmp * 2;
				cnt++;
			}
			total += 1.0 / n * Math.pow(0.5, cnt);
		}
		System.out.println(total);
	}
}
