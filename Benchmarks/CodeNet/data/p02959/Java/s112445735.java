
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
			int f = Math.min(a[i], b[i]);
			a[i] -= f;
			ans += f;
			int ff = b[i]-f;
			ans += ff;
			a[i+1] -= ff;
		}
		System.out.println(ans);
		sc.close();
	}
}
