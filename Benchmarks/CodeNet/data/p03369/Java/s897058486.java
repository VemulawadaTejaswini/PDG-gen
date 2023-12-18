import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int price = 700 + S.replaceAll("x", "").length() * 100;
		System.out.println(price);
		sc.close();
	}
}