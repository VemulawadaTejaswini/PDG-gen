import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		int m = scan.nextInt();

		for(int i = 0;i<m;i++) {

			int a = scan.nextInt();
			n -= a;
		}


			System.out.println(n<0?-1:n);


		scan.close();
	}

}
