import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");
		int[] B = new int[Ws.length];
		for(int i=0;i<Ws.length;i++){
			B[i]=Integer.parseInt(Ws[i]);
		}

		int[] A = new int[N];
		if(B.length > 2){
			A[0] = Math.min(B[0], B[1]);
		}else{
			A[0] = B[0];
		}

		for(int i=B.length-1;i>0;i--){
			if(B[i]<B[i-1]){
				A[i]=B[i];
			}else{
				A[i]=B[i-1];
			}
		}

		if(B.length > 2){
			A[A.length-1] = Math.max(B[B.length-2], B[B.length-1]);
		}else{
			A[A.length-1] = B[B.length-1];
		}


		long ans =0;
		for(int i=0;i<N;i++){
			ans+=A[i];
//			System.out.print(A[i]+" ");
		}

		System.out.println(ans);
	}
}
