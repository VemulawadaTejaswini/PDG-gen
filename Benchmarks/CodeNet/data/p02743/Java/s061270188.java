import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if(4*a*b < (c-a-b)* (c-a-b) && c-a-b > 0)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
