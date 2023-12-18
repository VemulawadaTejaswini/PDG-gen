import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double v[] = new double[n];
		double max = 0, ans, min = 999999;
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			max = Math.max(max, v[i]);
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				min = Math.min(min, (v[i] + v[j]) / 2);
			}
		}
		System.out.println((max + min) / 2);
	}
}