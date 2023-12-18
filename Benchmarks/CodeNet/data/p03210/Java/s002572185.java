import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 5 || n == 7 || n == 3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
