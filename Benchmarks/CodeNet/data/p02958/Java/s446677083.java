import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = p[i];
		}
		Arrays.sort(a);
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(p[i] != a[i]) {
				cnt++;
			}
		}
		if(cnt > 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
