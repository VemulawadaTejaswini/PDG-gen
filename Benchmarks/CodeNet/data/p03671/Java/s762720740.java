import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		if (a >= b && a >= c)
			System.out.println(b + c);
		else if (b >= a && b >= c)
			System.out.println(a + c);
		else
			System.out.println(a + b);
	}
}