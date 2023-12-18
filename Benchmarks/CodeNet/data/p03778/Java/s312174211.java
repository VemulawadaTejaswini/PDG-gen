import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		System.out.println(Math.min(Math.max(0, b - (a+W)), Math.max(0, a-(b+W))));
	}
}
