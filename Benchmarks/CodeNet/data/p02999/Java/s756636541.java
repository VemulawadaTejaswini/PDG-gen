import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		sc.close();

		if (X<A) System.out.println(0);
		else System.out.println(10);

	}

}