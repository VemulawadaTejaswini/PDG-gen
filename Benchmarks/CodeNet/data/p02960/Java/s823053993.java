import java.util.*;

public class Main {
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
//===========
// variables
//
	Scanner sc;
	String S;
	int[][] solCnt; // solCnt[i][x] : ≡ x となる解の個数(i 文字まで)
	
	private static final int MOD = 1000000007;
	
	// 10a + x ≡ b (mod 13) (x=0,1,..,9, b=0,1,...,12)
	// の解の個数を計算する。
	// 変形して x ≡ b-10a が 0～9 の場合 x は 1 つ定まり、そうでないとき
	// 解はない。
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		S = sc.next();
		
		solCnt = new int[S.length()][13];
		
		for (int i = 0; i < S.length(); i++) {
			// 解の個数を求めていく
			char digit = S.charAt(i);
			if (digit == '?') {
				for (int b = 0; b < 13; b++) {
					for (int a = 0; a < 13; a++) {
						if (i == 0 && a > 0) continue; // 最初は a=0 だけ処理
						// 解があるかをチェック
						int a10 = (a * 10)%13; // 0-12
						int x = (b - a10 + 13)%13;
						if ( (0 <= x) && (x <= 9) ) {
							// 解がある
							solCnt[i][b] += (i>0)? solCnt[i-1][a]:1;
							solCnt[i][b] = solCnt[i][b] % MOD;
						}
					}
				}
			} else {
				// 定数(m)の場合
				// 10a + m ≡ b となるかをチェック
				for (int b = 0; b < 13; b++) {
					for (int a = 0; a < 13; a++) {
						if (i == 0 && a > 0) continue; // 最初は a=0 だけ処理
						// 解があるかをチェック
						int a10 = (a * 10)%13; // 0-12
						int m = (b - a10 + 13)%13;
						if ( m == (int)(digit - '0')) {
							// 解がある
							solCnt[i][b] += (i>0)? solCnt[i-1][a]:1;
							solCnt[i][b] = solCnt[i][b] % MOD;
						}
					}
				}
			}
		}
		
		//
		out(solCnt[S.length()-1][5]);
	}
//=================

	/**
	 * 拡張ユークリッド互除法
	 * ax+by=gcd(a,b) となる gcd,x,y を求める。
	 */
	public static final int[] extgcd(int a, int b) {
		int x0 = 1, x1 = 0;
		int y0 = 0, y1 = 1;
	
		while (b != 0) {
			int q = a / b;
			int r = a % b;
			int x2 = x0 - q * x1;
			int y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
	
	    return new int[]{a, x0, y0};
	}

}
