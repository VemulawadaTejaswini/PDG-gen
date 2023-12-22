import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		sc.close();

		int count = n / x;
		if (n % x != 0) {
			count++;
		}

		print(count * t);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}
