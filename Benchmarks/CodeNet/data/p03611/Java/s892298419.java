import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		int cnt = 0;
		int max = 1;
		int X = 0;
		for(int i = 0;i < a.length;i++) {
			X = a[i];
			for(int j = 0;j < a.length;j++) {

				if(X - 1 == a[j] || X == a[j] || X + 1 == a[j]) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
			cnt = 0;
		}
		System.out.println(max);
	}
}