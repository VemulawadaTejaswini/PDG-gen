import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int mult = n * a;
		if (mult <= b) {
			System.out.println(mult);
		} else {
			System.out.println(b);
		}
	}
}
