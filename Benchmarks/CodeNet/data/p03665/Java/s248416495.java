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
		int N = Integer.parseInt(ss0[0]);
		int P = Integer.parseInt(ss0[1]);

		Integer[] p = new Integer[2];
		p[0]=0;
		p[1]=0;

		ss0 = br.readLine().trim().split(" ", 0);
		for(int i = 0; i < N; i++){
			p[Integer.parseInt(ss0[i]) % 2] += 1;
		}
		dp("p[0]=" + p[0] + ", p[1]=" + p[1]);

		long[][] C = new long[N+1][N+1];
		makeCombTable(C);

		long k=0;
		long g=0;
		long ans;

		g=0;
		for(int i=0; i<=p[0]; i++){
			g += C[p[0]][i];
			dp("g="+g);
		}
		dp("g="+g);

		if(P==0){
		//答えが偶数：偶数は全部＋1、奇数はあるなら偶数個の組み合わせ
			dp("偶数");
			//奇数
			k=0;
			for(int i=0; i<=p[1]; i=i+2){
				k += C[p[1]][i];
				dp("k=" + k);
			}
			
		}else{
		//答えが奇数：偶数は組み合わせ、奇数は奇数個の組み合わせ
			dp("奇数");
			//必ず奇数を奇数個選ぶ
			//k = (((p[1]+1)/2)*2)-1;
			k=0;
			dp("C[p[1]][i]=" + C[p[1]][1]);
			for(int i=1; i<=p[1]; i=i+2){
				k += C[p[1]][i];
				dp("k=" + k);
			}
		}
		
	System.out.println(g*k);
	return;
	}

	//------------------------------------------------------
	// C[n][k] -> nCk
	//   ＜使い方＞
	//     int N = 50;
	//     long[][] C = new long[N+1][N+1];
	//     makeCombTable(C);
	//     //checkInput(C);
	//     dp("C[5][2]="+C[5][2]);      // 5C2   -> 10
	//     dp("C[7][3]="+C[7][3]);      // 7C3   -> 35
	//     dp("C[10][1]="+C[10][1]);    // 10C1  -> 10
	//     dp("C[50][25]="+C[50][25]);  // 50C25 -> 126410606437752
	static void makeCombTable(long[][] C) {
		int N = C.length;
		for(int i=0; i<N; i++){
			for(int j=0; j<=i; j++) {
				if( (j==0) || (j==i) ) {
					C[i][j] = 1;
				} else {
					C[i][j] = C[i-1][j-1] + C[i-1][j];
				}
			}
		}
	}

	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		//System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }


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
	static void checkInput(long[] i1) {
		StringBuilder sb = new StringBuilder();
		for(long i: i1) sb.append("[" + i + "]");
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
