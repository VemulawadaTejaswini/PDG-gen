import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int cnt = 0;
		Arrays.sort(a);
		for(int i = 0;i < N;i++) {
			x -= a[i];
			if(x < 0)break;
			if((x >= 0 && i < N-1) || (x == 0 && i ==N-1)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}