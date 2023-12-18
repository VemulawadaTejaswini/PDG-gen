import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double ans = 0;
		if (N%2 == 0) {
			System.out.println("0.5000000000");
		}else {
			double n = (double)N;
			double m = (double)(N-1)/2;
			ans = 1 - m/n;
			System.out.println(ans);
		}

	}
}
