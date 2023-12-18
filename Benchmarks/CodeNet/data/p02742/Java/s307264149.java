import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		sc.close();

		print((h * w + 1) / 2);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
