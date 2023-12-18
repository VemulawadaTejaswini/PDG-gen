import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ve = new int[n][n];
		for(int i=0; i<n-1; i++) {
			ve[sc.nextInt()-1][sc.nextInt()-1] = sc.nextInt();
		}
		int q = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[q];
		int[] y = new int[q];
		for(int i=0; i<q; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();
		
		int[] tok = new int[n];
		for(int i=0; i<n; i++) {
			tok[i] = ve[k-1][i]>0?ve[k-1][i]:Integer.MAX_VALUE;
		}
		tok[k-1] = 0;
		
		while(true) {
			boolean flag = true;
			for(int i=0; i<n; i++) {
				if(tok[i]==Integer.MAX_VALUE) {
					flag = false;
					continue;
				} else {
					for(int j=0; j<n; j++) {
						if(ve[i][j] != 0) {
							tok[j] = tok[j]<tok[i]+ve[i][j]?tok[j]:tok[i]+ve[i][j];
						}
					}
				}
			}
			if(flag) break;
		}
		
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<q; i++) {
			int res = tok[x[i]-1] + tok[y[i]-1];
			sb.append(res + "\n");
		}
		System.out.print(sb.toString());
		
	}

}