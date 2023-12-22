import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(" ");

		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);

		int div = 0;

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				div++;
			}
		}

		System.out.println(div);
		sc.close();

	}

}

