import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] p = new int[A];
		Arrays.setAll(p, i -> sc.nextInt());
		Arrays.sort(p);
		int[] q = new int[B];
		Arrays.setAll(q, i -> sc.nextInt());
		Arrays.sort(q);
		int[] r = new int[C];
		Arrays.setAll(r, i -> sc.nextInt());
		Arrays.sort(r);
		long ans = 0;
		int red = A-X, green = B-Y;
		for(int i = C-1; i >= 0; i--) {
			if(r[i] < p[red] && r[i] < q[green])
				break;
			ans += r[i];
			if(p[red] > q[green])
				green++;
			else 
				red++;
		}
		for(int i = red; i < A; i++)
			ans += p[i];
		for(int i = green; i < B; i++)
			ans += q[i];
		System.out.println(ans);

	}

}
