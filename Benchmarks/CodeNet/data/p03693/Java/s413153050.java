import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
		
		System.out.println(((r * 100 + g * 10 + b) % 4 == 0) ? "YES" : "NO");
	}

}