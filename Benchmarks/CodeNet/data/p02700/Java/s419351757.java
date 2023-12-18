package java01;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt(), D = scanner.nextInt();
		while (true) {
			C = C - B;
			if (C <= 0)
			{
				System.out.println("Yes");
				break;
			}
			else
			{
				A = A - D;
			}
			if (A <= 0)
			{
				System.out.println("No");
				break;
			}
		}
		//System.out.println("Welcome to this course");
	}

}
