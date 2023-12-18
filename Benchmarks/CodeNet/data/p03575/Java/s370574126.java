import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[N][N];
		for (int i=0;i<M;i++) {
			int n,m;
			n= sc.nextInt();
			m= sc.nextInt();
			a[n-1][m-1] = 1;
			a[m-1][n-1] = 1;
		}
		boolean isExist = true;
		int result=0;
		while(isExist) {
			isExist = false;
			for (int i=0;i<N;i++) {
				int count =0;
				for (int j=0;j<M;j++) {
					if (a[i][j]==1) {
						count ++;
					}
				}
				if (count ==1) {
					result++;
					isExist = true;
					for (int j=0;j<M;j++) {
						a[i][j] =0;
						a[j][i] =0;
					}
				}
			}
		}
		System.out.println(result);
	}
}