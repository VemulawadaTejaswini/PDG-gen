import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ary[] = new int[n];

		int i = 0;
		while (n-- > 0) {
			int a = sc.nextInt();
			ary[i] = a;
			i++;
		}

		int min = Integer.MAX_VALUE;
		for (int j = 0; j < ary.length; j++) {
			min = Math.min(min, ary[j]);
		}

		int pos = 0;
		int ans = 0;
		boolean b = true;
		while (b) {
			int p = pos;
			for(p = 0; p < k; p++) {
				ary[pos + p] = min;
			}

			pos +=  k;
			if(pos > ary.length - k) pos = ary.length - k;

			int cnt = 0;

			ans++;
			if (cnt == ary.length) b = false;
			if (b == false) break;
		}
		System.out.println(ans);
	}
}