import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] x = new int[N][2];
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			int l = 0, r = 0;
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(')
					l++;
				else {
					if(l > 0)
						l--;
					else
						r++;
				}
			}
			x[i][0] = l;
			x[i][1] = r;
		}
		Arrays.sort(x, (a, b) -> a[1] - b[1]);
		int l = 0, r = 0;
		boolean ok = true;
		for(int i = 0; i < N; i++) {
			l -= x[i][1];
			if(l < 0) {
				ok = false;
				break;
			}
			l += x[i][0];
		}
		System.out.println(ok && l == 0 ? "Yes" : "No");
	}

}