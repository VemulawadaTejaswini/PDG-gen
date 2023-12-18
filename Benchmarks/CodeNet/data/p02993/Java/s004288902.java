package atCoder;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();

		if (a.equals(b) || b.equals(c) || c.equals(d)) {
			System.out.println("Bad");
			} else {
				System.out.println("Good");
				}

	}


}
