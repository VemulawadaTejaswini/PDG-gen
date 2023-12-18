import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int L = 0;
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		double X = (L / 3) * (L / 3) * (L / 3);
		System.out.println(X);
		sc.close();
	}
}