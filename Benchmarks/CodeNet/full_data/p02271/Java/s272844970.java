import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int n;
	static int[] A;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n  = Integer.parseInt(br.readLine());
		String[] AStr = br.readLine().split(" ");
		A = new int[n];
		for(int i = 0; i < n ; i++){
			A[i] = Integer.parseInt(AStr[i]);
		}

		int mLength = Integer.parseInt(br.readLine());
		String[] Mstr = br.readLine().split(" ");
		int[] M = new int[mLength];
		for(int i = 0; i < mLength ; i++){
			M[i] = Integer.parseInt(Mstr[i]);
		}

		for(int i = 0 ; i < mLength ; i++){
			if(solve(0,M[i])){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}

	}

	private static boolean solve(int i,int M){
		if(M == 0) return true;
		if(i == n) return false;

		return solve(i + 1, M) || solve(i + 1, M - A[i]);
	}

}