import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		List<Integer[]> list = new ArrayList<Integer[]>();
		for(int i = 0; i < m; i++) {
			int k = scan.nextInt();
			Integer[] sk = new Integer[k];
			for(int j = 0; j < k; j++) {
				sk[j] = scan.nextInt();
			}
			list.add(sk);
		}

		int[] p = new int[m];

		for(int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
		}

		int ans = 0;
		for(int i = 0; i < 1 << n; i++) {
			boolean f = true;
			for(int k = 0; k < m; k++) {
				int res = 0;
				for(int l = 0; l < list.get(k).length; l++) {
					if((1 & i >> list.get(k)[l] - 1) == 1) {
						res++;
					}
				}
				if(res % 2 == p[k]) {

				}else {
					f= false;
					break;
				}
			}
			if(f) {
				ans++;
			}
		}

		System.out.println(ans);

	}
}