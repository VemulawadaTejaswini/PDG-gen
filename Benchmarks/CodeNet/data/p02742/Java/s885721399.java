import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		long W = sc.nextInt();

		System.out.println((H * W) / 2 + (H * W) % 2);
	}

}
