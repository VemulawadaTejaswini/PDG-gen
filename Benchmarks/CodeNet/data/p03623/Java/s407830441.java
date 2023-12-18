import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int x=stdin.nextInt();
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		if(Math.abs(x-a)>Math.abs(x-b)) {
		System.out.println(x-b);
		} else {
			System.out.println(x-a);

		}

	}


}
