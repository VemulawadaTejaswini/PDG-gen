import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[A];
		int[] b = new int[B];

		int minA = Integer.MAX_VALUE;
		int minB = Integer.MAX_VALUE;
		for(int i=0; i<A; i++) {
			a[i] = sc.nextInt();
			minA = Math.min(minA, a[i]);
		}
		for(int i=0; i<B; i++) {
			b[i] = sc.nextInt();
			minB = Math.min(minB, b[i]);
		}
		int ans = minA + minB;
		
		for(int i=0; i<M; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int c = sc.nextInt();
			ans = Math.min(ans, a[x]+b[y]-c);
		}

		System.out.println(ans);
		sc.close();
	}
}
