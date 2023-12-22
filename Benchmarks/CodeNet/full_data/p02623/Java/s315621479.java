import java.util.*;

public class Main{
	static void dfs(long time,int index_a,int index_b){
		if(time <= k)ans = Math.max(ans, index_a+index_b);
		if(time > k ||(index_a >= n && index_b >= m))return;

		if(index_a < n)dfs(time+=a[index_a], ++index_a, index_b);
		if(index_b < m)dfs(time+=b[index_b], index_a, ++index_b);
	}
	static int ans = 0;
	static int[] a = new int[200000];
	static int[] b = new int[200000];
	static int n, m, k;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		k = scan.nextInt();
		for(int i = 0;i < n; ++i)a[i] = scan.nextInt();
		for(int i = 0;i < m; ++i)b[i] = scan.nextInt();

		dfs(0,0,0);
		System.out.print(ans);

	}
}
