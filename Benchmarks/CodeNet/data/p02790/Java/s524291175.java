import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int num = Math.min(a, b);
		int loop = Math.max(a, b);

		String ans = "";

		for (int i = 0; i < loop; i++) {
			ans = ans + String.valueOf(num);
		}

		print(ans);

		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
