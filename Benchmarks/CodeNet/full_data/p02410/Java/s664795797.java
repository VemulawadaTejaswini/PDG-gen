import java.util.Scanner;
public class Main{
	public static void main(String args){
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[100][100];
		int b[] = new  int[100];
		int c[] = new int [100];

		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();

		for(int i = 0;i<m;i++) {
			for(int j = 0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++)b[i]=sc.nextInt();

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i]+=(a[i][j]*b[j]);
			}
		}

		for(int i = 0;i<n;i++)System.out.println(c[i]);
		sc.close();
	}
}

