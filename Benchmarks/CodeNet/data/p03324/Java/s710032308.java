import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(n*(int)Math.pow(100, d));
	}

}