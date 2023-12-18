import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = a%b;

		int h = b - a%b;
		if(g >= h) {
			System.out.println(h);
		}else {
			System.out.println(g);
		}
	}
}