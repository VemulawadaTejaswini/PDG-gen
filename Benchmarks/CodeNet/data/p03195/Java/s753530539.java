import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int max = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		
		if((max - min) % 2 == 1) {
			System.out.println("first");
		} else {
			System.out.println("second");
		}
	}
}
