import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x[]=new int[m];
		for(int i=0; i<m; i++) {
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		int l[] = new int[m-1];
		for(int i=1; i<m; i++) {
			l[i-1]=x[i]-x[i-1];
		}
		Arrays.sort(l);

		if(n>=m) {
			System.out.println(0);
			sc.close();
			return;
		}
		int ans = Math.abs(x[m-1]-x[0]);
		for(int i=0; i<n-1; i++) {
			ans -= l[m-2-i];
		}
		System.out.println(ans);
		sc.close();
	}

}
