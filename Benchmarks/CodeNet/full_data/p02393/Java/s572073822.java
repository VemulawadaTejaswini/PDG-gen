import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int temp = 0;

		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}

		if(b > c) {
			temp = c;
			c = b;
			b = temp;
		}

		System.out.println(a + " " + b + " " + c );
	}
}