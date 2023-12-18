import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] ve = new long[n][n];
		for(int i=0; i<n-1; i++) {
			ve[sc.nextInt()-1][sc.nextInt()-1] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(ve[i][j]==0)ve[i][j]=ve[j][i];
			}
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
		
		long[] tok = new long[n];
		for(int i=0; i<n; i++) {
			tok[i] = ve[k-1][i]>0?ve[k-1][i]:Long.MAX_VALUE;
		}
		tok[k-1] = 0;
		
		while(true) {
			boolean flag = true;
			for(int i=0; i<n; i++) {
				if(tok[i]==Long.MAX_VALUE) {
					flag = false;
					continue;
				} else {
					for(int j=0; j<n; j++) {
						if(ve[i][j] != 0) {
							if(tok[j]>tok[i]+ve[i][j]) {
								flag = false;
								tok[j] = tok[i]+ve[i][j];
							}
						}
					}
				}
			}
			if(flag) break;
//			System.out.println("***********");
//			for(int A=0; A<n; A++) System.out.print(tok[A]+ " ");
//			System.out.println("\n***********");
			
		}
		
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<q; i++) {
			long res = tok[x[i]-1] + tok[y[i]-1];
			sb.append(res + "\n");
		}
		System.out.print(sb.toString());
		
	}

}