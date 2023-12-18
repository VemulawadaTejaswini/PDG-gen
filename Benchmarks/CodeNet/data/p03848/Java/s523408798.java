import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行目個数、2行目の複数の数字を配列に格納
		//   3
		//   1 2 3
		int N = Integer.parseInt(br.readLine());
		String[] ss0 = br.readLine().trim().split(" ", 0);
		Integer[] ii0 = new Integer[N];
		for(int i = 0; i < N; i++){
			ii0[i] = Integer.parseInt(ss0[i]);
		}
		
		
			//入力値確認
			for(int i=0; i < N; i++){
				//dp(ii0[i]);
			}

		if (N%2==0) {
			// 偶数個の場合、4::   1,3
			for(int i=0; i < N; i++){
				ii0[i] = (ii0[i] + 1) / 2;
			}
		} else {
			// 奇数個の場合、5:: 0,2,4
			for(int i=0; i < N; i++){
				ii0[i] = (ii0[i]) / 2;
			}
		}

		Arrays.sort(ii0);
			//入力値確認
			for(int i=0; i < N; i++){
				dp(ii0[i]);
			}
	
		
		boolean b = true;
		int j=0;
		for(int i=0; i < N; i++){
			if (N%2==0) {
				j = (i+2)/2;
			} else {
				j = (i+1)/2;
			}
				dp(j);
			b = (ii0[i] == j);
			if (b == false) { System.out.println(0); return; }
		}
		
		//
		j = (N/2);
		double d = j;
		System.out.println((int)((Math.pow(2d, d)) % (Math.pow(10d, 9d)+7)));

        return;
    }
    // Debug.Print
    static void dp(String s) {
		//System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}