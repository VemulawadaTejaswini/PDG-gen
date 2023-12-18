import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		double num = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			num += a[i];
		}
		num = num / (double)N;
		
		double ans_dist = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(Math.abs(num - (double)a[i]) < ans_dist) {
				ans_dist = Math.abs(num - (double)a[i]);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}