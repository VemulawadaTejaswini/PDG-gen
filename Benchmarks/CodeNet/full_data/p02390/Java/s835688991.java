import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int S = scan.nextInt();

		System.out.println((S/3600%60) + ":" + (S/60%60) + ":" + (S%60));
	}
}