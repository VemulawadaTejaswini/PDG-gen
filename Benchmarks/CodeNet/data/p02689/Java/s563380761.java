import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		Integer n = Integer.parseInt(tmp[0]);
		long m = Long.parseLong(tmp[1]);

		String[] tmp2 = scanner.nextLine().split(" ");
		long[] hList = new long[n];
		for(int i = 0; i < n; i++) {
			hList[i] = Long.parseLong(tmp2[i]);
		}

		boolean[] ans = new boolean[n];
		Arrays.fill(ans, true);


		int a = 0;
		int b = 0;
		for(int i = 0; i < m; i++) {

			String[] tmp3 = scanner.nextLine().split(" ");
			a = Integer.parseInt(tmp3[0]) - 1;
			b = Integer.parseInt(tmp3[1]) - 1;

			if(hList[a] > hList[b]) ans[b] = false;
			else if(hList[a] < hList[b]) ans[a] = false;
			else if(hList[a] == hList[b]) {
				ans[a] = false;
				ans[b] = false;
			}
		}

		int res = 0;
		for(boolean o : ans) {

			res += o == true ? 1 : 0;
		}
		System.out.println(res);
	}

}