import java.util.Scanner;

public class Main {

	private static int min = Integer.MAX_VALUE;
	private static int N, A, B, C;
	private static int[] l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[N];
		for (int i=0;i<N;i++) {
			l[i]=sc.nextInt();
		}
		sc.close();
		func(0, 0, 0, 0, 0);
		System.out.println(min);
	}

	private static void func(int n, int a, int b, int c, int cost) {
		if(n == N) {
			if(a==0 || b==0 || c==0) {
				return;
			}else {
				cost += Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c) - 30;
				min = Math.min(min, cost);
				return;
			}
		}
		func(n+1,a,b,c,cost);
		func(n+1,a+l[n],b,c,cost+10);
		func(n+1,a,b+l[n],c,cost+10);
		func(n+1,a,b,c+l[n],cost+10);
	}
}
