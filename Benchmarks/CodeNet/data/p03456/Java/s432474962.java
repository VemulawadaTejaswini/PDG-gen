import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 0; i < String.valueOf(b).length(); i++) {
			a *= 10;
		}
		a += b;
		int c = (int)(Math.sqrt(a));
		System.out.println((c * c == a)? "Yes" : "No");
	}
}