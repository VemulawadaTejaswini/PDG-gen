import java.util.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (a < b)
			System.out.println("a < b");
		else if (a == b)
			System.out.println("a == b");
		else System.out.println("a > b");
	}

}