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
		long N = Integer.parseInt(ss0[0]);
		long A = Integer.parseInt(ss0[1]);
		long B = Integer.parseInt(ss0[2]);
		long C = Integer.parseInt(ss0[3]);
		long D = Integer.parseInt(ss0[4]);
		String ans = "NO";

		//dp(N + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);

		long m=0;
		do {
			if( (-1*D*m + C*(N-1-m)) <= (B-A) ) {
			if( (B-A) <= (-1*C*m + D*(N-1-m) ) ) { 
				ans="YES"; break;
			}
			}
			m++;
			if(m==N){break;}
		} while (true);


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
