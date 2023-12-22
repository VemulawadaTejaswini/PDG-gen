import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	static int n;
	static int[] A;

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		A = new int[n];
		String[] str = br.readLine().split(" ");

		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}

		int q = Integer.parseInt(br.readLine());
		int[] m = new int[q];
		String[] str2 = br.readLine().split(" ");

		for(int i = 0; i < q; i++){
			m[i] = Integer.parseInt(str2[i]);
		}

		for(int i = 0; i < q; i++){
			if(solve(0 , m[i])){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

	public static boolean solve(int i, int m){
		if(m == 0){
			return true;
		}
		if(i >= n){
			return false;
		}
		boolean res = solve(i + 1, m) ||solve(i + 1, m - A[i]);
		return res;
	}
}