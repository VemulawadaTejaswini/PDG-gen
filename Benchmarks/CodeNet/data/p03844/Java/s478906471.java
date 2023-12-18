import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //
		int A = sc.nextInt();
		String op = sc.nextLine();
		int B = sc.nextInt();
		//AopBという計算式を作る
		if ("+".equals(op)) {
			System.out.print(A + B);
		} else {
			System.out.print(A - B);
		}
	}
}