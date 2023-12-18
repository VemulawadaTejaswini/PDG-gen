import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 素数を全列挙
		boolean[] isPrime = new boolean[55556];
		for(int i = 2 ; i <= 55555 ; i++) isPrime[i] = true;
		for(int i = 2 ; i <= 55555 ; i++) {
			for(int j = 2 ; j * j <= i ; j++) {
				if(i % j == 0) isPrime[i] = false;
			}
		}
		int cnt = 0;
		// 3で割って1余る素数を出力
		for(int i = 2 ; i <= 55555 ; i++) {
			if(i % 3 == 1 && isPrime[i]) {
				System.out.println(i);
				cnt++;
			}
			if(cnt == n) break;
		}
	}
}
