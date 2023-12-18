import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		long N = Long.parseLong(ss0[0]);
		long M = Long.parseLong(ss0[1]);

		if(N-M>=2){ System.out.println(0); return; }
		if(M-N>=2){ System.out.println(0); return; }

		dp("N=[" + N + "], M=[" + M + "]");
			
		long mod = 1000000007;
		long ans = 0;
		//i = 7 % 3;    // i = 1

		dp("mod=[" + mod + "], ans=[" + ans + "]");

		ans = ((fact(M) % mod) * (fact(N) % mod)) % mod;
		
		if(N==M) { ans = (ans * 2) % mod; }

		System.out.println(ans); return;
	}
	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		//System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }

	static long fact(long i) {
		long mod = 1000000007;
		long ans=i;

		//dp("mod=[" + mod + "], ans=[" + ans + "], i=[" + i + "]");

		if(i>1){ ans = (ans * fact(i-1)) % mod; }
		return ans;
	}

	//-----------------------------------------------------------------
	// 入力値確認：リスト
	static void checkInput(List l) { System.out.println(l); }
	//-----------------------------------------------------------------
	// 入力値確認：配列、1次元、float型
	//   ＜使い方＞
	//     float[] f = new float[N];
	//     checkInput(f);
	static void checkInput(float[] i1) {
		StringBuilder sb = new StringBuilder();
		for(float i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、1次元、int型
	//   ＜使い方＞
	//     int[] c = new int[N];
	//     checkInput(c);
	static void checkInput(int[] i1) {
		StringBuilder sb = new StringBuilder();
		for(int i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、二次元、int型
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、二次元、int型
	static void checkInput(long[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(long[] i1: i2){
			for(long i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}

}
