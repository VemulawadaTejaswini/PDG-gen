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
		
		if(max == 1) {
			System.out.println("first");
			return;
		}
		
		if((max - min) % 2 == 1) {
			System.out.println("first");
			return;
		} else {
			if(max == min) {
				System.out.println("first");
				return;
			}
			System.out.println("second");
			return;
		}
	}
}
