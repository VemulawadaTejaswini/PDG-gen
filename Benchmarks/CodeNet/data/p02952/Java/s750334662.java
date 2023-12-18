import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int cnt = 0;

		for ( int i = 1; i <= n; i++ ) {
			if(getDigits(i) %2 == 0) {
				continue;
			}else {
				cnt++;
			}
		}
		System.out.println(cnt);
		in.close();
	}

	// 桁数を返す
	public static int getDigits(int n) {
		int d = 0;
		while ( n >= 1 ) {
			n /= 10;
			d++;
		}
		return d;
	}
}