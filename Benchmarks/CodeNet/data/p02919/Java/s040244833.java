
import java.util.Scanner;

public class Main {

	public static long[] p;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = new long[n + 1];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextLong();
		}
		p[n] = 0;
		long ans = Calc(0, n - 1, 0);
		System.out.println(ans);
	}

	public static long Calc(int l, int r, int lr) {
		if(l > -1 && r < n && l != r) {
			int pos1 = n;
			int pos2 = n;
			int pos3 = n;
			for(int i = l; i < r + 1; i++) {
				if(p[i] > p[pos1]) {
					pos3 = pos2;
					pos2 = pos1;
					pos1 = i;
				} else if(p[i] > p[pos2]) {
					pos3 = pos2;
					pos2 = i;
				} else if(p[i] > p[pos3])
					pos3 = i;
			}
			long ret = 0;
			long tmp = p[pos2];
			if(pos1 > pos2) {
				int swap = pos2;
				pos2 = pos1;
				pos1 = swap;
			}
			int flag = 0;
			if(pos1 < pos3 && pos3 < pos2)
				flag++;
			ret += tmp * (pos1 - (l - 1)) * (r - (pos2 - 1));
			ret += Calc(l, pos2 - 1, flag);
			if(lr == 0) {
				ret += Calc(pos1 + 1, r, 0);
			}
			return ret;
		} else {
			return 0;
		}
	}

}
