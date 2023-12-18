import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		long X =Long.parseLong(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");
		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}

		long ans = Long.MAX_VALUE;
		long[] B = new long[A.length];
		for(int i=0;i<B.length;i++){
			B[i]=Math.abs(X-A[i]);
		}

		Arrays.sort(B);
		System.out.println(B[0]);


	}
}
