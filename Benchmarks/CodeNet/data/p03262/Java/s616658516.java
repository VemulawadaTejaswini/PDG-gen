import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[]x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();
		if(N == 1) {
			int ans = Math.abs(X - x[0]);
			System.out.println(ans);
			System.exit(0);
		}
		Arrays.sort(x);
		int[] k = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			k[i] = x[i + 1] - x[i];
		}
		Arrays.sort(k);
		int t = k[0];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= t / 2; i++) {
			if(t % i == 0) {
				list.add(i);
			}
		}
		list.add(t);
		int l = list.size();
		int m = 1;
		//System.out.println(t);
		for(int i = l - 1; i >= 0; i --) {
			boolean flag = true;
			int g = list.get(i);
			for(int j = 0; j < N - 1; j++) {
				if(k[j] % g != 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				m = g;
				break;
			}
		}

		int []r = new int[N];
		for(int i = 0; i < N; i++) {
			r[i] = Math.abs(X - x[i]);
		}
		Arrays.sort(r);
		for(int i = 0; i < N; i++) {
			if(r[i] % m != 0) {
				System.out.println(1);
				System.exit(0);
			}
		}
		System.out.println(m);

	}
}