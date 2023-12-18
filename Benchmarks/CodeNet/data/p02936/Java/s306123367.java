import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		int[] a = new int[n-1], b = new int[n-1];
		int[] p = new int[q], x = new int[q];
		for(int i = 0; i < n-1; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			a[i]--;
			b[i]--;
		}
		for(int i = 0; i < q; i++){
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
			p[i]--;
		}
		sc.close();

		//処理
		int[] prev = new int[n];
		prev[0] = -1;
		for(int i = 0; i < n-1; i++) prev[b[i]] = a[i];
		long[] ans = new long[n];
		for(int i = 0; i < n; i++) ans[i] = 0;
		for(int i = 0; i < q; i++) ans[p[i]] += x[i];
		for(int i = 1; i < n; i++){
			ans[i] += ans[prev[i]];
		}

		//出力
		for(int i = 0; i < n; i++){
			System.out.print(ans[i]);
			if(i == n-1) System.out.println();
			else System.out.print(" ");
		}
	}
}
