import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String U = scanner.nextLine();

		System.out.println(S);

		System.out.println(U.equals(S)?A-1:B-1);

	}

}
