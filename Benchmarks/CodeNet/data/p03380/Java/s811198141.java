import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int max = 0;
		int num_i = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if(max < a[i]) {
				max = a[i];
				num_i = i;
			}
		}
		
		double dist = Double.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(i == num_i) continue;
			if(dist > Math.abs((double)(max / 2) - (double)a[i])) {
				dist = Math.abs((double)max / 2 - (double)a[i]);
				ans = a[i];
			}
		}
		System.out.println(max + " " + ans);
	}
}
