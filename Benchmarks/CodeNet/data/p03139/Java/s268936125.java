import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = Math.min(a, b);

		System.out.print(min + " ");

		if(a + b - n > 0) {
			System.out.println(a + b - n);
		}else {
			System.out.println(0);
		}

	}
}
