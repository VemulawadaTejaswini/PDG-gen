import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public int A[];
	public int B[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Main main = new Main();
		main.A= new int[N];
		main.B= new int[N];
		for (int i=0;i<N;i++) {
			main.A[i]=i;
		}
		for (int i=0;i<M;i++) {
			int a= sc.nextInt();
			int b = sc.nextInt();
			main.unit(a, b);
		}
		int C[] = new int[N];
		for (int i=0;i<N;i++) {
			C[i] = main.find(i);
		}
		int count =0;
		Arrays.sort(C);
		for (int i=1;i<N;i++) {
			if (C[i]!=C[i-1]) {
				count ++;
			}
		}
		System.out.println(count);
	}

	public int find(int x) {
		if (this.A[x]==x) {
			return x;
		}
		return A[x]=find(A[x]);

	}

	public void unit(int x,int y) {
		x = find(x);
		y = find(y);
		if (x==y) {
			return ;
		}
		if (B[x]<B[y]) {
			A[x]= y;
		} else {
			A[y]= x;
			if (B[x]==B[y]) {
				B[x]++;
			}
		}
	}

}