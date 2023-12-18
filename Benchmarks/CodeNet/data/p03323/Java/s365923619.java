import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "Yay!";
	
		if (a > 8 || b > 8) {
			ans = ":(";
		}
		
		System.out.println(ans);

		sc.close();
	}
}
