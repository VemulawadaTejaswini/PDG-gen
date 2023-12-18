import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String b = sc.nextLine();

		if (b.charAt(0) == 'A') {
			System.out.println("T");
		}
		if (b.charAt(0) == 'T') {
			System.out.println("A");
		}
		if (b.charAt(0) == 'G') {
			System.out.println("C");
		}
		if (b.charAt(0) == 'C') {
			System.out.println("G");
		}
	}

}