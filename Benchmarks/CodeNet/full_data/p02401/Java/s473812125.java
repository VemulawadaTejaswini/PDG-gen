import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while(true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			if(op.equals("?")) {
				break;
			}

			if(op.equals("+")) {
				System.out.println(a + b);
			} else if(op.equals("-")) {
				System.out.println(a - b);
			} else if(op.equals("*")) {
				System.out.println(a * b);
			} else {
				System.out.println(a / b);
			}
		}
	}

}

