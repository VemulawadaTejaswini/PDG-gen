import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		Integer p[] = new Integer[A];
		Integer q[] = new Integer[B];
		Integer r[] = new Integer[C];
		Integer ary[] = new Integer[X + Y + C];
		for(int i = 0; i < A; i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < B; i++) {
			q[i] = sc.nextInt();
		}
		for(int i = 0; i < C; i++) {
			r[i] = sc.nextInt();
			ary[i] = r[i];
		}
		
		Arrays.sort(p, Collections.reverseOrder());
		Arrays.sort(q, Collections.reverseOrder());
		Arrays.sort(r, Collections.reverseOrder());
		for(int i = 0; i < X; i++) {
			ary[C + i] = p[i];
		}
		for(int i = 0; i < Y; i++) {
			ary[C + X + i] = q[i];
		}
		Arrays.sort(ary, Collections.reverseOrder());
		long ans = 0;
		for(int i = 0; i < X + Y; i++) {
			ans += ary[i];
		}
		System.out.println(ans);
	}
}
