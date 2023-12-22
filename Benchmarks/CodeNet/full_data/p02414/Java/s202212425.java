import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int m=sc.nextInt();
	private static int l=sc.nextInt();
	private static int[][] a=new int[n][m];
	private static int[][] b=new int[m][l];
	private static long[][] c=new long[n][l];
	public static void main(String[] args){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<l;j++){
				b[i][j]=sc.nextInt();
			}
		}
		multiply();
		for(int i=0;i<n;i++){
			for(int k=0;k<l-1;k++){
				System.out.print(c[i][k]+" ");
			}
			System.out.println(c[i][l-1]);
		}
	}
	private static void multiply(){
		for(int i=0;i<n;i++){
			for(int k=0;k<l;k++){
				for(int j=0;j<m;j++){
					c[i][k]+=a[i][j]*b[j][k];
				}
			}
		}
	}
}