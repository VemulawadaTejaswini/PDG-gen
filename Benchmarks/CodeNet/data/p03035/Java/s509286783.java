import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();


		if (A>=6 && A<=12) B/=2;
		else if (A<=5) B=0;

		System.out.println(B);
	}

}