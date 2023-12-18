import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a);
		System.out.println(b);


		long x = 1;
		long n = 0;
		while(true) {
			n = a * x;
			if(n % b == 0) {
				break;
			}
			x++;
		}

		System.out.println(x);

		System.out.println(n);

		sc.close();

	}

}
