import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 800*n;
		int y = 200*(n/15);
		System.out.println(x-y);
	}

}
