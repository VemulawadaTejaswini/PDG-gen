import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		int ans = 0;
		boolean even = true;
		while(even) {
			for(int i=0; i<n; i++) {
				if(a[i]%2 != 0) {
					even = false;
					break;
				}
				a[i] = a[i]/2;
			}
			if(even)ans++;
		}
		System.out.println(ans);
	}
}
