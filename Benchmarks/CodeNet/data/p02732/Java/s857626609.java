import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");
		int[] A = new int[N+1];
		A[0]=0;
		int[] X = new int[N+1];
		Arrays.fill(X, 0);
		for(int i=0;i<Ws.length;i++){
			A[i+1] = Integer.parseInt(Ws[i]);
			X[A[i+1]]++;
		}
		long[] C = new long[N+1];
		long All = 0;
		for(int i=1;i<A.length;i++){
			C[i] = calcConbi2(X[i]);
			All += C[i];
		}


		for(int i=1;i<A.length;i++){
			System.out.println(All-C[A[i]]+calcConbi2(X[A[i]]-1));
		}

	}

		public static long calcConbi2(long n ){
			if(n <= 0){
				return 0;
			}
			return (n*(n-1))/2;
		}

}
