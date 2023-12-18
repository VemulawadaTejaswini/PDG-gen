import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		a[0]=sc.nextLong();
		for(int i=1; i<n; i++) {
			a[i] = a[i-1]+sc.nextLong();
		}
		long ans = Long.MAX_VALUE;
		for(int i=0; i<n-1; i++) {
			ans = Math.min(ans, Math.abs(a[i] - (a[n-1] - a[i])));
		}
		System.out.println(ans);
		sc.close();
	}
}
