import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		while (true) {
			int tmpA = sc1.nextInt();
			int tmpB = sc1.nextInt();
			if (tmpA == 0 && tmpB == 0) {
				break;
			}
			else if (tmpA > tmpB){
				System.out.println(tmpB + " " + tmpA);
			}
			else {
				System.out.println(tmpA + " " + tmpB);
			}
		}

		sc1.close();

	}

}
