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
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(a);
		int r=a[n/2];
		int l=a[n/2-1];

		for(int i=0; i<n; i++) {
			int ans;
			if(b[i]<r) {
				ans = r;
			} else {
				ans = l;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
