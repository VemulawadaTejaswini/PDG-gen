import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min1 = Math.min(a, b);
		int min2 = Math.min(min1, c);
		if(a == min2) {
			System.out.println(b + c);
		}
		if(b == min2) {
			System.out.println(a + c);
		}
		if(c == min2) {
			System.out.println(a + b);
		}
	}
}
