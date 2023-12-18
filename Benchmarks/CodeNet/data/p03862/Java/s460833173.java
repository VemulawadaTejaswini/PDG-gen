import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		outside : for(int i = 0; i < N; i++) {
			long sum = 0;
			if(i == 0) {
				sum = a[0] + a[1];
				while(sum > x) {
					if(a[1] > 0) {
						sum--;
						a[1]--;
						ans++;
					} else {
						sum--;
						a[0]--;
						ans++;
					}
				}
				continue outside;
			}
			if(i == N - 1) {
				sum = a[N - 2] + a[N - 1];
				while(sum > x) {
					if(a[N - 1] > 0) {
						sum--;
						a[N - 1]--;
						ans++;
					} else {
						sum--;
						a[N - 2]--;
						ans++;
					}
				}
				continue outside;
			}
			
			sum = a[i] + a[i + 1];
			while(sum > x) {
				if(a[i + 1] > 0) {
					sum--;
					a[i + 1]--;
					ans++;
				} else {
					sum--;
					a[i]--;
					ans++;
				}
			}
			
			sum = a[i - 1] + a[i];
			while(sum > x) {
				if(a[i] > 0){
					sum--;
					a[i]--;
					ans++;
				} else {
					sum--;
					a[i - 1]--;
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
