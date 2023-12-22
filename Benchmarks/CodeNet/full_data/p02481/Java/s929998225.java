import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a, b;
		int len, rect;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		rect = a * b;
		len = a * 2 + b * 2;
		System.out.println(rect + " " + len);
	}

}