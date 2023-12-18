//-----------------------------------------------------------
// すぐ使える
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);  // 人数　－＞行数
		int C = Integer.parseInt(ss0[1]);  // バス定員
		int K = Integer.parseInt(ss0[2]);  // 待ち猶予時間

		long[] t1 = new long[N];  //0で初期化される
		for(int i=0; i<N; i++) {
			t1[i] = Integer.parseInt(br.readLine());  // 到着時刻
		}
		Arrays.sort(t1);

		long ans = 0;

		long c = 0; //待ち客数
		long t = t1[0];
		for(int i=0; i<N; i++) {
			if (i+1 == N) { ans += 1; break;}
			c += 1;
			if ( ((t+K)>=t1[i+1]) && (C>c) ) {
				//次の時間でも大丈夫
				//System.out.println(i+" "+t1[i]+" NEXT!");
			} else {
				//次の時間じゃダメ
				ans += 1;
				t = t1[i+1];
				c = 0;
				//System.out.println(i+" "+t1[i]+" GO NOW  ans=" + ans + "  c=" + c);
			}

		}


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



}
