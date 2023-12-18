import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int dam = 0;
	int count = 0;
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0;  i < N; i++) {
			if(b[N-i-1] <= a[N-1]) break;
			dam += b[N-i-1];
			count++;
			if(dam >= H) {
				System.out.println(count);
				sc.close();
				return;
			}
		}
		while(dam < H) {
			count++;
			dam += a[N-1];
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