import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int n;
	static int[] A;
	static int q;
	static int m;
	static boolean ret = false;

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		String [] temp = br.readLine().split(" ");
		int max = temp.length;
		A = new int[max];
		for(int i = 0; i < max ; i++){
			A[i] = Integer.parseInt(temp[i]);
		}

		q = Integer.parseInt(br.readLine());

		temp = br.readLine().split(" ");
		max = temp.length;
		for(int i = 0; i < max ; i++){
			m = Integer.parseInt(temp[i]);
			if(solve(0,m)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}

	}

	public static boolean solve(int i,int m){
		if(m == 0) return true;

		if(i >= n) return false;

		ret = solve(i+1,m) || solve(i+1,m-A[i]);
		return ret;
	}

}