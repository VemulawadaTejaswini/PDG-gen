import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		int cnt = 0;

		for(long i = 2; i <= 1000000000000l; i++ ) {
			if(a % i == 0 && a/i != i) {
				a /= i;
				cnt++;
				if(a == 1) {
					System.out.println(cnt);
					return;
				}
			}
		}

	}

}
