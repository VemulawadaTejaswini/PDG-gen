import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a[][]=new int [100][100];
		int b[]=new int [100];
		int c[]=new int [100];
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		int i,j;
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<m;i++)b[i]=scan.nextInt();
		
		for(i=0;i<n;i++){
			c[i]=0;
			for(j=0;j<m;j++){
				c[i]+=a[i][j]*b[j];
			}
		}
		
		for(i=0;i<n;i++)System.out.println(c[i]);
		
	}
}
