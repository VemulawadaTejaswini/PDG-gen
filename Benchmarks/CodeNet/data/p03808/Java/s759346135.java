import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

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
		
		do {
		
			if (isZero(ii0)) { System.out.println("YES"); return; }
			if (isMinus(ii0)) { System.out.println("NO"); return; }

			int n = BiggestN(ii0);
			dp(BiggestN(ii0));
			
			for(int i = n; i >= 0 ; i--){
				ii0[i] = ii0[i] - (N - (n-i));
				dp(ii0[i] );
			}
			int j = 0;
			for(int i = n+1; i < N ; i++){
				j++;
				ii0[i] = ii0[i] - j;
				dp(ii0[i] );
			}
			
			
		} while (true);
		
		
    }
    // Debug.Print
    static void dp(String s) {
		//System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

	static int BiggestN(Integer ii0[]) {
		int ans = ii0[0];
		int n = 0;
		for (int i = 1; i < ii0.length; i++) {
			if (ans < ii0[i]) {
				ans = ii0[i];
				n = i;
			}
		}
		
		return n;
	}

	static boolean isZero(Integer ii0[]) {
		int a = 0;
		for (int i = 1; i < ii0.length; i++) {
			if (ii0[i] != 0) { return false; }
		}
		return true;
	}

	static boolean isMinus(Integer ii0[]) {
		int a = 0;
		for (int i = 1; i < ii0.length; i++) {
			if (ii0[i] < 0) { return true; }
		}
		return false;
	}

}