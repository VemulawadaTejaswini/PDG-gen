import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int[] x = new int[M];
		int[] y = new int[M];
		int[] c = new int[M];
		int m = 0;
		for(int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < B; i++) {
			b[i] = sc.nextInt();

		}
		m = a[0] + b[0];
		for(int i = 0; i < Math.min(A, B); i++) {
			if(a[i]+b[i]<=m)m = a[i]+b[i];
		}
		for(int i = 0; i < M; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if(a[x[i]-1]+b[y[i]-1]-c[i] <= m)m = a[x[i]-1]+b[y[i]-1]-c[i];
		}
		System.out.println(m);
	}
}