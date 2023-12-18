import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		int ans = 0;
		for(int i=0; i<K; i++) {
			for(int j=0; j<K; j++) {
				for(int k=0; k<K; k++) {
					ans += gcd(gcd(i, j), k);
				}
			}
		}

		System.out.println(ans);
	}

	//最大公約数
	static int gcd(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);

		if(small == 0) {
			return big;
		}

		return gcd(small, big % small);
	}

}
