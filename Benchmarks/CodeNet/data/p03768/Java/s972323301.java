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
		int[][] hashi = new int[M*2][2];
		for(int i = 0; i < M; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			a[i] = Integer.parseInt(ss0[0]);
			b[i] = Integer.parseInt(ss0[1]);
			
			//双方向なので、相手情報も自分に入れる
			a[i+M]=b[i];
			b[i+M]=a[i];
			
			hashi[i][0]=a[i];
			hashi[i][1]=b[i];
			hashi[i+M][0]=b[i];
			hashi[i+M][1]=a[i];
			
		}
		//checkInput(a);
		//checkInput(b);

		//dp("hashi");
		//checkInput(hashi);

		int Q = Integer.parseInt(br.readLine());
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
		//ans = new int[N+1];

		//checkInput(a, b);
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
		//dp("Q=["+Q+"]");
		for(int i=Q-1; i>=0; i--){
			kiten = v[i];
			kyori = d[i];
			iro = c[i];
			
			dp("Q=["+Q+"]"+", i=["+i+"]"+", kiten=["+kiten+"]"+", kyori=["+kyori+"]"+", iro=["+iro+"]");
			ironuri(kiten, kyori, iro, a, b, ans, sumi);
			for(int j=0; j<sumi.length-1; j++) sumi[j]=0;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int j = 1; j < N+1; j++){
			//System.out.println(ans[j]);
			sb.append(ans[j]);
			sb.append(System.getProperty("line.separator")); //改行コード
		}
		System.out.print(sb);

        //System.out.println(ans);
        return;
    }

    //-----------------------------------------------------------------
	static void ironuri(int kiten, int kyori, int iro, int[] a, int[] b, int[] ans, int[] sumi) {
		//基本動作：自分を塗って、次に渡す
		dp("初期値：kyori=["+kyori+"], kiten=["+kiten+"]" + ", ans[kiten]=["+ans[kiten]+"]" + ", sumi[kiten]=["+sumi[kiten]+"]");
		
		////既に自分が塗られていたら、塗らずに終わる
		if(sumi[kiten]>0) { return; }
		//if(ans[kiten]>0) { return; }
		////自分を塗る
		//ans[kiten] = iro;

		if(ans[kiten]==0) {
			ans[kiten] = iro;
			sumi[kiten] = 1;
		}
		
		
		//距離を減らす。足りなければ終わり
		kyori -= 1;
		if(kyori < 0){ return; }

		//次を探して、渡す
		for(int i=0; i<a.length-1; i++) {
			
			//自分とつながる相手に、同じ事をさせる(再帰させる)
			if(a[i]==kiten){
				ironuri(b[i], kyori, iro, a, b, ans, sumi);
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
	static void checkInput(int[] a, int[] b) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<a.length; i++){
			sb.append("["+a[i]+"]["+b[i]+"]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.print(sb);
	}
	//-----------------------------------------------------------------
	// 入力値確認：配列、1次元、1つ
	//     int[] a = new int[N];
	//     checkInput(a);
	static void checkInput(int[] i1) {
		StringBuilder sb = new StringBuilder();
		for(int i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//     long[] f = new long[N];
	//     checkInput(a);
	static void checkInput(long[] i1) {
		StringBuilder sb = new StringBuilder();
		for(long i: i1) sb.append("[" + i + "]");
		System.out.println(sb);
	}
	//     float[] f = new float[N];
	//     checkInput(f);
	static void checkInput(float[] i1) {
		StringBuilder sb = new StringBuilder();
		for(float i: i1) sb.append("[" + i + "]");
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
