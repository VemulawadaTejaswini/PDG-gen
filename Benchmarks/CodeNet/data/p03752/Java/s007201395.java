//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int K = Integer.parseInt(ss0[1]);
		long ans = 0;

		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		ss0 = br.readLine().trim().split(" ", 0);
		long[] ii0 = new long[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}
		
		//checkInput(ii0);
		long max = 0;

		if(N==K){
			max = ii0[0];
			for(int i = 1; i < N; i++){
				if(max>=ii0[i]){
					ans += max - ii0[i] + 1;
					max += 1;
				} else {
					max = ii0[i];
				}
			}
			System.out.println(ans); 
			return;
		}
		
		
		
//		//差を保存し、個数を調べる
//		long count=0;
//		Integer[] iSa = new Integer[N];
//		Integer[] iCost0 = new Integer[N];  // maxと同じ高さにするためのコスト。0なら見えない。
//		for(int i = 1; i < N; i++){
//			//iSa[i] = ii0[i]-ii0[i-1];
//			iCost0[i] = max - ii0[i];
//			if(ii0[i]>max){
//				count++;
//				max = ii0[i];
//			}
//		}
//		
//		//個数が多ければ、終わり
//		if( count>=K){ System.out.println(ans); return; }
//		
//		//足りない個数だけ、コスト0＋1をかければ、
//
//
//        System.out.println(iCount + " " + s);
		System.out.println(ans);
        return;
    }
    //-----------------------------------------------------------------
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
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

//-----------------------------------------------------------
//-----------------------------------------------------------
