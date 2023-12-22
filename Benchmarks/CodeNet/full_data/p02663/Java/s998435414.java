import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int K = sc.nextInt();

		int hm1 = h1 * 60 + m1;
		int hm2 = h2 * 60 + m2;

		System.out.println(hm2-hm1-K);

	}

}
