import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d  =sc.nextInt();

		int a = n / ((2*d) + 1);
		int b = n %((2*d) + 1);
		if (b > 0) a++;

		System.out.println(a);

		sc.close();
	}
}
