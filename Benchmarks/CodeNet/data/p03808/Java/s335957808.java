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
		
		Integer[] ii1 = new Integer[N];
		int a = 0;
		for(int i = 0; i < N-1; i++){
			ii1[i] = ii0[i+1] - ii0[i];
		}
		ii1[N-1] = ii0[0] - ii0[N-1];
		
		BigDecimal ans = new BigDecimal("0");
		for(int i = 0; i < N; i++){
			//System.out.println(ii1[i]);
			if (ii1[i] == 0) {
				System.out.println("NO");
				return;
			}
			ans = ans.add( BigDecimal.valueOf( ii1[i] ));
		}

		BigDecimal zero = new BigDecimal("0");
		if (ans.compareTo(zero) == 0) {
	        System.out.println("YES");
	    } else {
	        System.out.println("NO");
		}
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}