import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		if (n == 1) {
			int a = Integer.parseInt(sc.next());
			System.out.println(Math.abs(w - a));
			return;
		}
		for (int i = 0; i < n - 2; i++)
			sc.next();
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		System.out.println(Math.max(Math.abs(a - b), Math.abs(w - b)));
	}
}