
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}

		int b[] = new int[40];
		for(int i=0; i<n; i++) {
			for(int j=39; j>=0; j--) {
				b[j] += (a[i]>>j)&1;
			}
		}
		long x = 0;
		for(int i=39; i>=0; i--) {
			if(((1L<<i)+x<=k) && b[i]*2<n) {
				x += (1L<<i);
			}
		}

		long ans = 0;
		for(int i=0; i<n; i++) {
			ans += a[i] ^ x;
		}
		System.out.println(ans);
		sc.close();
	}

}
