import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	static int[] w; 
	static int[] v;
	static int W;
	static int  N;
	static long[][] memo;
	public static long solve(int i, int weight)
	{
		if(i==N)
			return 0;
		if(memo[i][weight]!=-1)
			return memo[i][weight];
		if(weight+w[i]>W)
		return solve(i+1, weight);
		return memo[i][weight]=Math.max(v[i] + solve(i+1, weight + w[i]), solve(i+1, weight));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =new PrintWriter(System.out);
		StringTokenizer st= new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		W=Integer.parseInt(st.nextToken());
		w= new int[N];
		v=new int[N];
		for (int i = 0; i < N; i++) {
			st=new StringTokenizer(br.readLine());
			w[i]=Integer.parseInt(st.nextToken());
			v[i]=Integer.parseInt(st.nextToken());
		}
		memo=new long[N][W+1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < W+1; j++) {
				memo[i][j]=-1;
			}
		}
		pw.print(solve(0, 0));
		pw.close();
	}
}
