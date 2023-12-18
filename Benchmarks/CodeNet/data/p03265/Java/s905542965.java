import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X1, Y1, X2, Y2, X3, Y3, X4, Y4;
		X1 = sc.nextInt();
		Y1 = sc.nextInt();
		X2 = sc.nextInt();
		Y2 = sc.nextInt();
		sc.close();

		int dx = X2 - X1;
		int dy = Y2 - Y1;
		X3 = X2 - dy;
		Y3 = Y2 + dx;
		X4 = X3 - dx;
		Y4 = Y3 - dy;
		System.out.println(X3 + " " + Y3 + " " + X4 + " " + Y4);
	}
}
