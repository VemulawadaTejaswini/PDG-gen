import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		System.out.println( (int)(Math.log(n) / Math.log(2)));

	}
}