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

		int[][] A = new int[M][2];
		for (int i = 0; i < M; i++) {
			W = in.readLine();
			Ws = W.split(" ");
			A[i][0] = Integer.parseInt(Ws[0]);
			A[i][1] = Integer.parseInt(Ws[1]);
		}

		int[] X = new int[N];
		Arrays.fill(X, -1);
		for(int i=0;i<A.length;i++){
			if(X[A[i][0]-1] == -1 || X[A[i][0]-1] == A[i][1] ){
				X[A[i][0]-1] = A[i][1];
			}else{
				System.out.println(-1);
				return;
			}
		}

		int ans = 0;
		for(int i=0;i<X.length;i++){
			if(X[i] == -1){
				X[i]=0;
			}
			ans += Math.pow(10, N-i-1)*X[i];
		}

		if(ans==0){
			ans=-1;
		}
		System.out.println(ans);


	}
}
