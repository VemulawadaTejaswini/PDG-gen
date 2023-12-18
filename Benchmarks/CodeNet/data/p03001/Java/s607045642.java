import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble();
		double H= sc.nextDouble();
		int x = sc.nextInt();
		int y = sc.nextInt();

		double ans = W*H/2;

		if (x==W/2 && y==H/2) {
			System.out.println(ans + " 1" );
		}else {
			System.out.println(ans + " 0");
		}
	}
}
