import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			if (i % 2 == 0)
				b += a /= 2;
			else
				a += b /= 2;
		}

		System.out.println(a + " " + b);

		sc.close();
	}

}
