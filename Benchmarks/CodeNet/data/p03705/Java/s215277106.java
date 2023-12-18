import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long N=scan.nextInt();
		long A=scan.nextInt();
		long B=scan.nextInt();

		long ans =1L+ N*(B-A);
		System.out.println(ans);

	}

}
