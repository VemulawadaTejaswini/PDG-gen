import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int B = 0; int A = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			A += a;
			B += a*a;
		}
		System.out.println(B-A*A/n);
		sc.close();

	}

}