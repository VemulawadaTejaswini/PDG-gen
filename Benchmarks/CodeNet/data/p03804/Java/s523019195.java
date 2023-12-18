import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int M = Integer.parseInt(ss0[1]);

		
		// 2行目以降文字列を配列に格納
		String[] A = new String[N];
		for(int i = 0; i < N; i++){ A[i] = br.readLine(); }
		String[] B = new String[M];
		for(int i = 0; i < M; i++){ B[i] = br.readLine(); }

					//入力値確認
					for(int i=0; i < N; i++){
						//System.out.println(A[i]);
					}
					for(int i=0; i < M; i++){
						//System.out.println(B[i]);
					}
		
		int a = N-M+1;
		String sa = "";
		String sb = "";
		
		sb = sss(B, 0, 0, a);
		for(int j=0; j < a; j++){
			for(int i=0; i < a; i++){
				sa = sss(A, i, j, a);
				if ( sa.equals(sb) ){ System.out.println("Yes"); return; }
			}
		}
		

		System.out.println("No"); return;


    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

	static String sss(String[] A, int I, int J, int L){
		String s = "";
		
		for(int i = I; i<I+L; i++) {
			s = s + A[i].substring(J, J+L);
		}
		
		return s;
	}
}

