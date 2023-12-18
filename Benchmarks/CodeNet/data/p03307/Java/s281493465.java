import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if (A % 2 == 0) {
			System.out.println(A);
			return;
		}
		System.out.println(A * 2);

	}

}