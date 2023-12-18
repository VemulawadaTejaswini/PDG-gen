import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0;i<N;i++){
			W = in.readLine();
			A[i]=Integer.parseInt(W);
			B[i]=Integer.parseInt(W);
		}

		Arrays.sort(B);

		for(int i=0;i<N;i++){
			int indx = Arrays.binarySearch(B, A[i]);
			if(indx ==N-1){
				System.out.println(B[indx-1]);
			}else {
				System.out.println(B[N-1]);
			}
		}
	}

}
