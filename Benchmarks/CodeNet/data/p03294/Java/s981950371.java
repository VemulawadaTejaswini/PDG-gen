	import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int n  	   = Integer.parseInt(t[0]);
			//long k = Long.parseLong(t[1].replaceAll("\\.", ""));

			String[] r = sc.nextLine().split(" ");
			long[] list = new long[n];
			long ans    = 0;
			for(int i = 0; i < n; i ++) {
				list[i] = Long.parseLong(r[i]);
				ans    += list[i] - 1;
			}

			System.out.println(ans);
		}

	}