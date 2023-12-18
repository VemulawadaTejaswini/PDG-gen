import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //
		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int K = Integer.parseInt(ss0[1]);

		ss0 = br.readLine().trim().split(" ", 0);
		Integer[] ii0 = new Integer[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}
//				for(int i: ii0) {
//					System.out.println(i);
//				}

		//配列のソート
		Arrays.sort(ii0, Collections.reverseOrder());
//				for(int i: ii0) {
//					System.out.println(i);
//				}

		//全部足しても届かないなら、全部不要
		long sum = 0;
		for(int i: ii0) { sum += i; }
		if (sum < K) { System.out.println(N); return;}

		//
		int[] fuyou = new int[N];
		for(int i=0; i<N; i++) { fuyou[i] = 1;}
		
		int j2 = 0;
		for(int j=0; j<N; j++) {
			sum = 0;
			j2 = j;
			for(int i=j; i<N; i++) {
				if(sum+ii0[i] >= K) {
					setNeed(fuyou, j2, i);
					j2 = i;
					//break;
				} else {
					sum += ii0[i];
				}
			}
		}

		int ans = 0;
		for(int i: fuyou) { ans += i; }

//				for(int i: fuyou) {
//					System.out.println(i);
//				}

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
	//
	static void setNeed(int[] i1, int I, int N) {
		for(int i=I; i<=N; i++) {
			i1[i] = 0;
		}
	}
	
	//-----------------------------------------------------------------
	// 入力値確認
	static void checkInput(int[][] i2) {
		StringBuilder sb = new StringBuilder();
		for(int[] i1: i2){
			for(int i: i1) sb.append("[" + i + "]");
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}

}