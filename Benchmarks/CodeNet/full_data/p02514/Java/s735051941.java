import java.util.Scanner;

public class Main{

	public static int minimumCut(int g[][]) {
		int n = g.length;
		int[] v = new int[n];
		for(int i=0; i<n; i++) v[i] = i;
		int cut = Integer.MAX_VALUE;
		boolean[] a = new boolean[n];
		int[] na = new int[n];
		int[] w = new int[n];
		while(n>1) {
			a[v[0]] = true;
			for(int i=1; i<n; i++) {
				a[v[i]] = false;
				na[i - 1] = i;
				w[i] = g[v[0]][v[i]];
			}
			int prev = v[0];
			for(int i=1; i<n; i++) {
				int zj = -1;
				for(int j=1; j<n; j++)
					if(!a[v[j]]&&(zj < 0 || w[j]>w[zj])) zj = j;
				a[v[zj]] = true;
				if(i==n-1) {
					cut = Math.min(cut, w[zj]);
					for(int j=0; j<n; j++){
						g[v[j]][prev] += g[v[zj]][v[j]];
						g[prev][v[j]] += g[v[j]][v[zj]];
					}
					v[zj]=v[--n];
					break;
				}
				prev = v[zj];
				for(int j=1; j<n; j++)
					if(!a[v[j]]) w[j]+=g[v[zj]][v[j]];
			}
		}
		return cut;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0&&m==0)break;
			int[][] cap = new int[n][n];
			while(m--!=0){
				int s = sc.nextInt();
				int t = sc.nextInt();
				cap[s][t] = sc.nextInt();
			}
			System.out.println(minimumCut(cap));
		}
	}
}