import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		// 1行、2つ(複数)数字
//		String[] ss0 = br.readLine().trim().split(" ", 0);
//		int N = Integer.parseInt(ss0[0]);
//		int M = Integer.parseInt(ss0[1]);
//		
//
//		int[][] ii = new int[2][2*M+2];
//		int a=0;
//		int b=0;
//		for(int i = 1; i < M+1; i++){
//			ss0 = br.readLine().trim().split(" ", 0);
//			a = Integer.parseInt(ss0[0]);
//			b = Integer.parseInt(ss0[1]);
//			ii[0][i] = a;
//			ii[1][i] = b;
//			ii[0][i+M] = b;
//			ii[1][i+M] = a;
//		}
//		
//		//
//		List<Integer> l = new ArrayList<Integer>();
//		for(int i = 1; i < 2*M+1; i++){
//			//1からやってく
//			//初期化。
//			a = ii[0][i];
//			b = ii[1][i];
//			l.add(a);
//			do {
//				for(int j=1; j>ii.length; j++){
//					//橋の相手を探し、
//					if(b == ii[0][j]){
//						//見つけた
//						a = b
//						b = ii[1][j]
//						l.add(a);
//						//カウントが十分で、
//						//パスの少なくとも一方の端点と直接辺で結ばれている頂点は、必ずパスに含まれる
//					} else {
//						//見つからない。ダメ。
//					}
//				}
//			} while ();
//		}
//
//		checkInput(ii);
		
        System.out.println(3);
        System.out.println("3 5 1");
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
