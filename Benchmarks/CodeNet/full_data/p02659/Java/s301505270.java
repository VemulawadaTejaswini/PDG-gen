import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		String[] b = sc.next().split("[^0-9]");
		long bunshi = 100 * Long.parseLong(b[0]) + Long.parseLong(b[1]);
		long ans = a * bunshi / 100;
		System.out.println(ans);
	}

}
