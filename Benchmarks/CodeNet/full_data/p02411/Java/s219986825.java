import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int m,f,r;
		char a;

		while(true) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

			if(m == -1 && f == -1 && r == -1) break;
						else if(m == -1 || f == -1) a = 'F';
			else if(m + f >= 80) a = 'A';
			else if(m + f >= 65) a = 'B';
			else if(m + f >= 50 || (m + f >= 30 && r >= 50)) a = 'C';
			else if(m + f >= 30) a = 'D';
			else a = 'F';

			System.out.println(a);
		}

	}
}

