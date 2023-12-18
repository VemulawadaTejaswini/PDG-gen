import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int fee = 0;

		if(A<=5) {
			fee = 0;
		}if(6<=A && A<=12) {
			fee = B/2;
		}if(13<=A) {
			fee = B;
		}

		System.out.println(fee);
	}

}
