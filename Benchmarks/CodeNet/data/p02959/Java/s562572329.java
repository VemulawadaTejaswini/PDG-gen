
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n];
		for(int i=0; i<n+1; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i]=sc.nextInt();
		}
		int ans = 0;
		for(int i=0; i<n; i++) {
			if(a[i]<=b[i]) {
				ans += a[i];
				int m = Math.min(a[i+1], b[i]-a[i]);
				ans += m;
				a[i+1]-=m;
			}else {
				ans += b[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
