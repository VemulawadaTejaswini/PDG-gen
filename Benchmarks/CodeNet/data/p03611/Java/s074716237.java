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

		int[] A = new int[200000];
		Arrays.fill(A, 0);
		for (int i = 0; i < Ws.length; i++) {
			int x = Integer.parseInt(Ws[i]);
			A[x]++;
		}

		Arrays.sort(A);

		System.out.println(A[A.length-3]+A[A.length-2]+A[A.length-1]);


	}
}
