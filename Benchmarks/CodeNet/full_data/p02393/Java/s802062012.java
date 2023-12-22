
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b && b < c) {
			System.out.print(a + "\t" + b + "\t" + c);
		} else if(a < c && c < b) {
			System.out.print(a + "\t" + c + "\t" + b);
		} else if(b < a && a < c) {
			System.out.print(b + "\t" + a + "\t" + c);
		} else if(b < c && c < a) {
			System.out.print(b + "\t" + c + "\t" + a);
		} else if(c < a && a < b) {
			System.out.print(c + "\t" + a + "\t" + b);
		} else if(c < b && b < a) {
			System.out.print(c + "\t" + b + "\t" + a);
		}
	}
}
