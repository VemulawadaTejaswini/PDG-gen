import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = 0, B = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {

			A = sc.nextInt();
			B = sc.nextInt();

			if (H <= A) {
				if (W <= B) {
					++count;
				}
			}
		}

		System.out.println(count);

	}

}
