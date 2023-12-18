//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
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
		int M = Integer.parseInt(ss0[1]);

		// 1行目個数、2行目以降文字列を配列に格納
		ss0 = new String[M];
		int[] a = new int[M*2];
		int[] b = new int[M*2];
		int[] hashi = new int[N+1]; //橋の本数
		for(int i = 0; i < M; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			a[i] = Integer.parseInt(ss0[0]);
			b[i] = Integer.parseInt(ss0[1]);
			
			//双方向なので、相手情報も自分に入れる
			a[i+M]=b[i];
			b[i+M]=a[i];
			
			//橋の本数を数える
			hashi[a[i]] += 1; 
			hashi[b[i]] += 1; 
		}
		//checkInput(a);
		//checkInput(b);
		//checkInput(hashi);

		ss0 = br.readLine().trim().split(" ", 0);
		int Q = Integer.parseInt(ss0[0]);
		int[] v = new int[Q];
		int[] d = new int[Q];
		int[] c = new int[Q];
		for(int i = 0; i < Q; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			v[i] = Integer.parseInt(ss0[0]);
			d[i] = Integer.parseInt(ss0[1]);
			c[i] = Integer.parseInt(ss0[2]);
		}

		int[] ans = new int[N+1];
		int[] sumi = new int[N+1];

		//checkInput(a);
		//checkInput(b);
		//checkInput(v);
		//checkInput(d);
		//checkInput(c);
		//checkInput(ans);
		
		//
		//
		int kiten = 0;
		int kyori = 0;
		int iro = 0;
		
		//Q回、繰り返す
		for(int i = 0; i < Q; i++){
			kiten = v[i];
			kyori = d[i];
			iro = c[i];
			
			ironuri(kiten, kyori, iro, a, b, ans, sumi, hashi);
			for(int j = 0; j < N+1; j++){
				sumi[j] = 0;
			}
			//dp(i + ": ans = "); checkInput(ans);
		}

		for(int j = 1; j < N+1; j++){
			System.out.println(ans[j]);
		}

        //System.out.println(ans);
        return;
    }
    //-----------------------------------------------------------------
    // Debug.Print
    static void dp(String s) {
		//System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

	//
	static void ironuri(int kiten, int kyori, int iro, int[] a, int[] b, int[] ans, int[] sumi, int[] hashi) {
		//基本動作：自分を塗って、次に渡す
		dp("初期値：kyori=["+kyori+"], kiten=["+kiten+"], sumi[kiten]=["+sumi[kiten]+"], hashi[kiten]=["+hashi[kiten]+"]");
		
		//自分を塗る
		ans[kiten] = iro;
		sumi[kiten] = 1;
		
		//次を探して渡す
			//自分に橋が無いなら終わり(→探す意味がない)
			if(hashi[kiten]==0){ return; }
		
			//距離を減らす。足りなければ終わり
			kyori -= 1;
			if(kyori < 0){ return; }

		int hashi_count=0;
		for(int i=0; i<a.length-1; i++) {
			if(hashi_count > hashi[kiten]) { break; } //探し終わってるなら、そこで終了
			
			//自分とつながる相手に、同じ事をさせる(再帰させる)
			if(a[i]==kiten){
				hashi_count += 1;
				
				//相手がまだ通過してなければ、実行する
				if(sumi[b[i]]==0) {
					ironuri(b[i], kyori, iro, a, b, ans, sumi, hashi);
				}
			}
		}
		
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

//-----------------------------------------------------------
//-----------------------------------------------------------
