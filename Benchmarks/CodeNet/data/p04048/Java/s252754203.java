import java.util.Scanner;

/**
 * B - Mysterious Light
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if (n%2 == 0) {
			System.out.println((n-1)*3 - (x <= n/2 ? (x-1)*3 : (n-x-1)*3));
		} else {
			System.out.println((n-1)*3);
		}
	}
}
