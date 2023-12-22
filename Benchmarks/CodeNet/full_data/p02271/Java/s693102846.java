import java.io.*;

public class Main{

	public static int[] a;
	public static int n;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		String[] ins = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(ins[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] m = new int[q];
		String[] in = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			m[i] = Integer.parseInt(in[i]);
		}

		for(int i = 0; i < q; i++){
			System.out.printf("%s\n", solve(0, m[i])? "yes" : "no");
			
		}
	}

	static boolean solve(int i, int m){
		if(m == 0)
			return true;
		if(i >= n)
			return false;
		return solve(i+1, m) || solve(i+1, m-a[i]);
	}
}