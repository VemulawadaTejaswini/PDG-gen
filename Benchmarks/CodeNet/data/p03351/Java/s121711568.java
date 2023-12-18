
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean ans = (Math.abs(a - c) >= 0) || ((Math.abs(a - b) >= 0) && (Math.abs(b - c) >= 0));
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
