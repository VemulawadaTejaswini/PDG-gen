import java.util.Scanner;

// https://atcoder.jp/contests/abc162/tasks/abc162_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();


		int ans = 0;

		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				for(int k =1;k<=n;k++) {
					ans = ans + gcd(i,j,k);
				}
			}
		}


		System.out.println(ans);
	}


	public static final int gcd(final int... param) {
	    final int len = param.length;
	    int g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}

	public static final int gcd(int a, int b) {
	    //a > b にする（スワップ）
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    //ユークリッドの互除法
	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;    //b には r=0 の値が入るため、a を返す
	}
}
