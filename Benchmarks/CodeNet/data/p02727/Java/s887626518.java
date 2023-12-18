import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		Integer p[] = new Integer[A];
		for(int i = 0; i < A; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p, Collections.reverseOrder());
		Integer ans[] = new Integer[X + Y + C];
		for(int i = 0; i < X; i++) {
			ans[i] = p[i];
		}
		Integer q[] = new Integer[B];
		for(int i = 0; i < B; i++) {
			q[i] = sc.nextInt();
		}
		Arrays.sort(q, Collections.reverseOrder());
		for(int i = 0; i < Y; i++) {
			ans[X + i] = q[i];
		}
		int r[] = new int[C];
		for(int i = 0; i < C; i++) {
			r[i] = sc.nextInt();
			ans[X + Y + i] = r[i];
		}
		Arrays.sort(ans, Collections.reverseOrder());
		
		long num = 0;
		for(int i = 0; i < X + Y; i++) {
			num += ans[i];
		}
		System.out.println(num);
	}
}
