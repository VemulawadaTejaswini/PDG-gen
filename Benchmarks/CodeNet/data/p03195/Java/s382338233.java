import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		long max = 0;
		long min = Long.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		int maxcnt = 0;
		int mincnt = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] == max) maxcnt++;
			if(a[i] == min) mincnt++;
		}
		
		if(max == 1) {
			System.out.println("first");
			return;
		}
		
		if((max - min) % 2 == 1) {
			System.out.println("first");
			return;
		} else {
			if(maxcnt % 2 == 0) {
				System.out.println("first");
				return;
			} else {
				System.out.println("second");
				return;
			}
		}
	}
}
