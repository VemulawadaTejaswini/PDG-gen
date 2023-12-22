import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int t = scan.nextInt();
		int s = scan.nextInt();

		if(d / s <= t) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
