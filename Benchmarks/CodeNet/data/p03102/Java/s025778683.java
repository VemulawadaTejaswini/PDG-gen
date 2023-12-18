import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int a[][]= new int[n][m];
		int b[]= new int[m];
		int c= scan.nextInt();
		for(int i=0;i<m;i++) {
			b[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		scan.close();
		int cnt=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=a[i][j]*b[j];
			}
			if(sum+c>0)cnt++;
		}
		System.out.println(cnt);
	}
}