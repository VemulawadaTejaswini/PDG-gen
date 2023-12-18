import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int max = -1;
		int min = Integer.MAX_VALUE;
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=min; i<=max; i++) {
			int tmp = 0;
			for(int j=0; j<n; j++) {
				tmp += (a[j] - i) * (a[j] - i);
			}
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}
}
