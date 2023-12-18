import java.util.Scanner;

public class Main {
	static int N;
	static int A;
	static int B;
	static int C;
	static int l[];
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		l = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
		}
		dfs(0,0,0,0,0);
		System.out.println(min);
	}
	public static void dfs(int a,int b, int c,int i,int cost) {
		if (i==N) {
			if (a==0 || b==0 || c==0) {
				return;
			}
			cost += Math.abs(a-A) + Math.abs(b-B) + Math.abs(c-C) -30;
			min = Math.min(min, cost);
			return;
		}
		dfs(a,b,c,i+1,cost);
		dfs(a+l[i],b,c,i+1,cost+10);
		dfs(a,b+l[i],c,i+1,cost+10);
		dfs(a,b,c+l[i],i+1,cost+10);
	}
}