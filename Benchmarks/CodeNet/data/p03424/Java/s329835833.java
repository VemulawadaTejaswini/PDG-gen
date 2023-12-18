import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = "Three";

		// 個数の入力
		int num = sc.nextInt();

		String[] colors = new String[num];
		for(int i = 0; i < num ; i++) {
			colors[i] = sc.next();
		}

		sc.close();

		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equals("Y")) {
				output = "Four";
				break;
			}
		}

		System.out.println(output);
	}
}