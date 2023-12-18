import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = (int) Math.pow(sc.nextDouble(), 2);
		int a = sc.nextInt();

		System.out.println(n-a);
	}
}