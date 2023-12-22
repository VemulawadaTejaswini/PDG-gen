package lesson;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b && b < c) {
			System.out.println(a + "\t" + b + "\t" + c);
		} else if(a < c && c < b) {
			System.out.println(a + "\t" + c + "\t" + b);
		} else if(b < a && a < c) {
			System.out.println(b + "\t" + a + "\t" + c);
		} else if(b < c && c < a) {
			System.out.print(b + "\t" + c + "\t" + a);
		} else if(c < a && a < b) {
			System.out.println(c + "\t" + a + "\t" + b);
		} else {
			System.out.println(c + "\t" + b + "\t" + a);
		}
	}
}
