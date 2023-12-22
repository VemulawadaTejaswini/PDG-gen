import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = 4*x-y;
		int b = y-2*x;

		if (a>=0 && a%2 == 0 && b>=0 && b%2 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
