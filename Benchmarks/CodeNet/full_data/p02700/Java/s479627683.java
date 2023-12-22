import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		while (true) {
			c -= b;
//			System.out.println("c=" + c);
			if (c <= 0) {
				System.out.println("Yes");
				return;
			}
			
			a -= d;
//			System.out.println("a=" + a);
			if (a <= 0) {
				System.out.println("No");
				return;
			}
			
		}
	}
}
