import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		int[] A = new int[N+1];
		A[0]=0;
		W = in.readLine();
		String[] Ws = W.split(" ");
		for(int i=1;i<N+1;i++){
			A[i]=Integer.parseInt(Ws[i-1]);
		}

		int[] B = new int[N+1];
		long ans = 0;
		long p = 1;
		for(int i=1;i<N+1;i++){
			int x =0;
			for(int k = i;k<N+1 ;k=k+i){
				x+=A[k];
			}
			ans+=(p*(x%2));
			p=p<<1;
		}

		System.out.println(ans);
	}

}
