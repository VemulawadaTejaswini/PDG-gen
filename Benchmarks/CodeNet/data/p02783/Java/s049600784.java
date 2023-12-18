import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		sc.close();
		if (h % a == 0) {
			print(h / a);
			return;
		}
		print((h / a) + 1);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
