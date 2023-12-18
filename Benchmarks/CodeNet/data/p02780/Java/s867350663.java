import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}
		int N = (int)A[0];
		int K = (int)A[1];

		W = in.readLine();
		Ws = W.split(" ");
		A = new long[Ws.length];
		double[] B = new double[(int)N];
		Arrays.fill(B,0);
		double ans = 0;
		double sum = 0;
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
			if(i >= K){
				sum-=A[i-K]*(A[i-K]+1)/(2.0*A[i-K]);
			}
			sum+=A[i]*(A[i]+1)/(2.0*A[i]);
			ans = Math.max(ans, sum);

		}


		System.out.printf("%.12f",ans);
	}
}
