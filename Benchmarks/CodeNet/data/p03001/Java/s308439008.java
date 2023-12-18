import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		boolean flag = (W / 2.0 == x && H / 2.0 == y);
		double ans = W / 2.0 * H;

		System.out.print(ans + " ");
		if (flag) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		String[] str = line.split(" ");
//		int N = Integer.parseInt(str[0]);
//		long K = Long.parseLong(str[1]);
//		int[] a = new int[N];
//		String[] a_str = reader.readLine().split(" ");
//		for (int i = 0; i < N; i++) {
//			a[i] = Integer.parseInt(a_str[i]);
//		}
//		long ans = 0;
//		
//		for (int i = 0; i < N; i++) {
//			long sum = 0;
//			for (int k = i; k < N; k++) {
//				sum += a[i];
//				if (sum >= K) {
//					ans += N - k;
//					break;
//				}
//			}
//			System.out.println(ans);
//		}
//		System.out.println(ans);
	}
}
