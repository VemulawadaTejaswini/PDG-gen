import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		int total = 0;
		int a =0;
		int b =0;
		int c =0;
		int d =0;

		a = sc1.nextInt();
		b = sc1.nextInt();
		c = sc1.nextInt();
		d = sc1.nextInt();

		if(a<b) {
			total += a;
		}
		else {
			total += b;
		}

		if(c<d) {
			total += c;
		}
		else {
			total += d;
		}

		System.out.println(total);

		sc1.close();

	}

}
