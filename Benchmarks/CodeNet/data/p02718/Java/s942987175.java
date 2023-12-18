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
		int M = Integer.parseInt(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");
		long[] A = new long[Ws.length];
		long sum = 0;
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
			sum+=A[i];
		}

		Arrays.sort(A);
		String ans = "Yes";
		for(int i=0;i<M;i++){
			if(A[N-1-i]/(1.0*sum) < (1.0/(4*M))){
				ans = "No";
				break;
			}
		}
		System.out.println(ans);

	}
}
