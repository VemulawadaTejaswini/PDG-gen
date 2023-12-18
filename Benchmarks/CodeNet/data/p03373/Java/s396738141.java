import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int sum1 = A*X + B*Y;
		int sum2 = X > Y ? (2*C*Y) + (A*(X - Y)):(2*C*X) + (B*(Y - X)) ;
		int sum3 = X > Y ? 2*C*X : 2*C*Y;
		System.out.println(Math.min(sum3, Math.min(sum1,sum2)));
	}
}