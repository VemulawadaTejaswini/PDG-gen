import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		int result = 0;

		int R =Integer.parseInt(line1);
		int G = Integer.parseInt(line2);

		result = G*2 -R;

		System.out.println(result);
	}