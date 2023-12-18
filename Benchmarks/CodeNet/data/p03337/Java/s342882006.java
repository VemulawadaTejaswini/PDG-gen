import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動 されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(Math.max(Math.max(a+b, a-b), a*b));
		
	}

}