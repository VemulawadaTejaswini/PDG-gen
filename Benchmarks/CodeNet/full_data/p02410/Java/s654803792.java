import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=1;
		long[][] m1=new long[n][m];
		long[][] m2=new long[m][l];
		long[][] ans=new long[n][l];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				m1[i][j]=sc.nextLong();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<l; j++) {
				m2[i][j]=sc.nextLong();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<l; j++) {
				long tmp=0;
				for(int k=0; k<m; k++) {
					tmp+=m1[i][k]*m2[k][j];
				}
				ans[i][j]=tmp;
			}
		}
		output(ans,n,l);
	}
	public static void output(long[][] a,int h,int w) {
		for(int i=0; i<h; i++) {
			for(int j=0; j<w-1; j++) {
				System.out.print(a[i][j]+" ");
			}
			if(w>0) {
				System.out.println(a[i][w-1]);;
			}
		}
	}
}
