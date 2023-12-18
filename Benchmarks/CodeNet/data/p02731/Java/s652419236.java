import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();
		double x = L / 3;
		double ans = Math.pow(x, 3);
		System.out.println(ans);
	}
}