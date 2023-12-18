import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long N = Long.parseLong(W);

		W = in.readLine();
		String[] Ws = W.split(" ");

		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}

		Arrays.sort(A);

		long ans =0;
		for(int i=A.length-2;i>=A.length/3;i=i-2){
			ans+=A[i];
		}

		System.out.println(ans);
	}
}
