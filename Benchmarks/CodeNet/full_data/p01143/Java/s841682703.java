import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if (n == 0 && m == 0 && p == 0)
				break;
			double per = 1 - (double) p / 100;
			int[] ns = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				ns[i] = sc.nextInt();
				sum += ns[i];
			}
			int r = 0;
			if(ns[m-1] != 0) r = (int)(sum * 100 * per) / ns[m - 1];
			System.out.println(r);
		}
		sc.close();
	}
}