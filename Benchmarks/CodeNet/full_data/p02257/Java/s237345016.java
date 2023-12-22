import java.util.Arrays;
import java.util.Scanner;

public class Main{
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int count = 0;
		boolean[] f = new boolean[100000001];
		for(int i = 2; i <= 100000000; i++) {
			if(f[i] != true) {
				for(int j = i+i; j <= 100000000; j += i) {
					f[j] = true;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(f[a[i]]==false) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
