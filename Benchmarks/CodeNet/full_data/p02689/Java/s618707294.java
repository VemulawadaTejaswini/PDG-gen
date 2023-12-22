import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		Integer n = Integer.parseInt(tmp[0]);
		long m = Long.parseLong(tmp[1]);

		String[] tmp2 = scanner.nextLine().split(" ");
		long[] hList = new long[n];
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			hList[i] = Long.parseLong(tmp2[i]);
			ans[i] = 1;
		}



		int a = 0;
		int b = 0;
		for(int i = 0; i < m; i++) {

			String[] tmp3 = scanner.nextLine().split(" ");
			a = Integer.parseInt(tmp3[0]) - 1;
			b = Integer.parseInt(tmp3[1]) - 1;

			if(hList[a] > hList[b]) ans[b]--;
			else if(hList[a] < hList[b]) ans[a]--;
			else if(hList[a] == hList[b]) {
				ans[a]--;
				ans[b]--;
			}
		}

		int res = 0;
		for(int o : ans) {

			res += o > 0 ? 1 : 0;
		}
		System.out.println(res);
	}

}
