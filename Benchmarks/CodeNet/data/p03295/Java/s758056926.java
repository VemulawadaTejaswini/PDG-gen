
	import java.util.Arrays;
import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int n = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);

			int[][] list = new int[m][2];
			int[]   hasi = new int[n];

			Arrays.fill(hasi, 1);

			long ans    = 0;
			for(int i = 0; i < m; i ++) {
				list[i] = new int[] {sc.nextInt(), sc.nextInt()};
			}

			Arrays.sort(list, (a, b) -> a[1] - b[1]);

			int cnt = 0;
			int max = 0;
			for(int i = 0; i < m; i++) {
				int[] pair = list[i];
				if(max <= pair[0]) {
					max = pair[1];
					cnt++;
					System.out.println("max" + max + "cnt" + cnt);
				}

				System.out.println("pa0" + pair[0] + "pa1" + pair[1]);
			}


			System.out.println(cnt);
		}
	}
