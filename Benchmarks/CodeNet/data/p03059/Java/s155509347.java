import java.util.Scanner;

public class Main {
	public static void main(String ... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		int count = 0;
		while (a * count <= t) {
			count++;
		}
		System.out.println((count - 1) * b);
	}
}
