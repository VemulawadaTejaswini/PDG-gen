import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		if(Math.abs(a - b) > d) {
			if(Math.abs(a - c) <= d && Math.abs(b - c) <= d)
				System.out.println("Yes");
			else
				System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
