import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rgb = 100 * sc.nextInt() + 10 * sc.nextInt() + sc.nextInt();
		System.out.println((rgb % 4 == 0)? "YES" : "NO");
	}
}