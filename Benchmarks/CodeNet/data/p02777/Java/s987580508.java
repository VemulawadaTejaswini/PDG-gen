import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		String U = scanner.nextLine();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		System.out.println(U.equals(S)?A-1:B-1);

	}

}
