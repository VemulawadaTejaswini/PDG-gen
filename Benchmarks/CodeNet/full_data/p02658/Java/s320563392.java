import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		long b = scan.nextLong();
		int nn = 0;
		for(long i=1;i<a;i++) {
			if(b>1000000000000000000L) {
				nn = -1;
				i += a;
			}
			int c = scan.nextInt();
			b = b*c;

		}
		if(nn == -1) {
			System.out.print(nn);
		}
		else {
			System.out.print(b);
		}
	}

}