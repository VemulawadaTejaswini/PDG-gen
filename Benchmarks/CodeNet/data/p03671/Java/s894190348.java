import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		int c=stdin.nextInt();
		System.out.println(a+b+c-Math.max(Math.max(a, b), Math.max(b, c)));
		// TODO 自動生成されたメソッド・スタブ

	}

}
