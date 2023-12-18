import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		X -= A;
		int Y = X / B;
		X -= Y * B;
		System.out.println(X);
	}
}