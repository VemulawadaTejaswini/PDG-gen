
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		a[n]=Integer.MAX_VALUE;
		int ans = 0;
		for(int i=1; i<=n; i++) {
			ans += Math.min(a[i]-a[i-1], t);
		}
		System.out.println(ans);
		sc.close();
	}
}


