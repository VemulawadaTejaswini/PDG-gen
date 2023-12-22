import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int A[] = new int[n];
		String[] tmps = br.readLine().split(" ");
		for(int i = 0 ; i < n ; i++){
			A[i] = Integer.parseInt(tmps[i]);
		}
		int q = partition(A,0,n - 1);
		disp(A,n,q);
	}

	public static void disp(int[] A,int n,int q){
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n ; i++ ){
			if(i == q){
				sb.append("[");
				sb.append(A[i]);
				sb.append("]");
				sb.append(" ");
			}else{
				sb.append(A[i]);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

	public static int partition(int[] A,int p,int r){
		int x = A[r];
		int mI = -1;
		int tmp;
		for(int i = 0 ; i < r ; i++){
			if(A[i] <= x){
				tmp = A[i];
				A[i] = A[++mI];
				A[mI] = tmp;
			}
		}
		tmp = x;
		A[r] = A[++mI];
		A[mI] = tmp;
		return mI;
	}
}