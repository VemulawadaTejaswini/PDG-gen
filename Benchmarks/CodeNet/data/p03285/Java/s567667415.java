import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			if(n % 4 == 0 || n % 7 == 0) {
				System.out.println("Yes");
				return;
			}
			n -= 11;
		}
		System.out.println("No");
	}
}
