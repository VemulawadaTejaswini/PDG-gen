import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = (A + B) / 2;

		if ((A+B)%2==0) {
			System.out.println(K);
		} else {
			System.out.println("IMPOSSIBLE");
		}
    }
}