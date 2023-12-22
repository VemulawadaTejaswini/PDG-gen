import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		final Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] p=new int[n+1];
		int[][] m=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			p[i-1]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		for(int i=1;i<=n;i++)m[i][i]=0;
		for(int l=2;l<=n;l++){
			for(int i=1;i<=n-l+1;i++){
				int j=i+l-1;
				m[i][j]=(Integer.MAX_VALUE);
				for(int k=i;k<=j-1;k++){
					m[i][j]=Math.min(m[i][j],m[i][k]+m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j]);
				}
			}
		}
		System.out.println(m[1][n]);
	}
	
	
}