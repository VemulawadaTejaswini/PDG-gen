import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum1 += s[i];
		}
		double m = sum1 / n;
		for (int i = 0; i < n; i++) {
			sum2 += (s[i] - m) * (s[i] - m);
		}
		double sd = Math.sqrt((double) sum2 / n);
		System.out.println(sd);
		sc.close();
	}

}
