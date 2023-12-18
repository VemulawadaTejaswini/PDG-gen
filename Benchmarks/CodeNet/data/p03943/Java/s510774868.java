import java.io.BufferedReader;
import java.io.InputStreamReader;

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


		if(A[0]==A[1]+A[2] || A[1] == A[0]+A[2] || A[2] == A[0]+A[1]){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}
	}

}
