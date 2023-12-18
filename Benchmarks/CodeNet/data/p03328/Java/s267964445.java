import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = b - a;
		int b_ = 0;
		for (int i = 1; i <= c; i++) {
			b_ += i;
		}
		System.out.println(b_ -b);

	}

}
