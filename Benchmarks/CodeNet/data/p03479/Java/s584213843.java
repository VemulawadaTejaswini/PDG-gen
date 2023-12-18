import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long y = Long.parseLong(sc.next());
		int m = 0;
		while (x <= y) {
			m++;
			x *= 2;
		}
		System.out.println(m);
	}
}