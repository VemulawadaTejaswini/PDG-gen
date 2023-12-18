import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		int[] c = new int[N];
		int[][] edge = new int[N][2];
		int[] num = new int[N];
		long ans = 0;
		for(int i = 0; i < N-1; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			edge[a[i]-1][1]++;
			edge[b[i]-1][1]++;
		}
		for(int i = 0; i < N; i++)
			edge[i][0] = i;
		Arrays.sort(edge, (x,y) -> x[1] - y[1]);
		for(int i = 0; i < N; i++)
			c[i] = sc.nextInt();
		Arrays.sort(c);
		for(int i = N-1; i >= 0; i--)
			num[edge[i][0]] = c[i];
		for(int i = 0; i < N-1; i++)
			ans += Math.min(num[a[i]-1], num[b[i]-1]);
		System.out.println(ans);
	}

}
