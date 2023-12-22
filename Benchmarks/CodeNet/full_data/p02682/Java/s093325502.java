import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(a+b>=k ? (a>=k ? 1*k : 1*a) : 1*a-1*(k-a-b));
	}
}