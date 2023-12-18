import java.util.Scanner;

public class Main {
	long c[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long a[]= new long[N];
		long b[][]= new long[N][N];
		for (int i=0;i<N-1;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			b[x-1][y-1] =1;
		}
		for (int i=0;i<Q;i++) {
			int p,x;
			p = sc.nextInt();
			x =sc .nextInt();
			a[p-1]+=x;
		}
		Main main = new Main();
		main.c = new long[N];
		main.c[0] = a[0];
		main.bfs(a,b,0);
		for (int i=0;i<N;i++) {
			System.out.print(main.c[i]+ " ");
		}
	}
	public void bfs(long a[],long b[][],int before) {
		for (int i=1;i<a.length;i++) {
			if (b[before][i]==1) {
				c[i] = a[i]+c[before];
				bfs(a,b,i);
			}
		}
	}
}