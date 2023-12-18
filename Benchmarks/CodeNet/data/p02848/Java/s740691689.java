
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int num = sc.nextInt();
		String line = sc.next();
		String first = line;
		String second = line;
		first = first.substring(0, num);
		second = second.substring(num, second.length());

		// 出力
		System.out.println(second + first);
	}
}