import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		if(a == max2) {
			System.out.println(b + c);
		}
		if(b == max2) {
			System.out.println(a + c);
		}
		if(c == max2) {
			System.out.println(a + b);
		}
	}
}
