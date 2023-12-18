import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int takahashi = a;
		if(a > b) {
			takahashi--;
		}
		System.out.println(takahashi);
	}
}