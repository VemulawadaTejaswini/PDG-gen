import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ans = a+ (int) Math.pow(a, 2)+(int) Math.pow(a, 3);
		System.out.println(ans);
	}

}
