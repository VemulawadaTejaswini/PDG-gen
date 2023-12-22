import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strs = str.split(" ");

		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);

		int d = a / b;
		int r = a % b;
		float f = (float)a / (float)b;



		System.out.printf("%d %d %f",d, r, f);
		sc.close();


	}

}

