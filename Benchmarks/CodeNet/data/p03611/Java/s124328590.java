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

		int[] A = new int[100001];
		Arrays.fill(A, 0);
		for (int i = 0; i < Ws.length; i++) {
			int x = Integer.parseInt(Ws[i]);
			A[x]++;
		}
		long ans = 0;
		long tmp = 0;
		for(int i=0;i<A.length;i++){
			if(i<3){
				ans+=A[i];
				tmp+=A[i];
			}else{
				tmp=tmp-A[i-3]+A[i];
				ans = Math.max(ans, tmp);
			}


		}

		System.out.println(ans);


	}
}
