import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] x = new int[N][2];
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			int A = 0, B = 0, l = 0, r = 0;
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(')
					l++;
				else
					r++;
				A = Math.max(r-l, A);
			}
			l = 0; r = 0;
			for(int j = S.length()-1; j >= 0; j--) {
				if(S.charAt(j) == '(')
					l++;
				else
					r++;
				B = Math.max(l-r, B);
			}
			x[i][0] = B;
			x[i][1] = A;
		}
		Arrays.sort(x, (a, b) -> a[1] - b[1]);
		int l = 0;
		boolean okl = true;
		for(int i = 0; i < N; i++) {
			if(x[i][0]-x[i][1] >= 0) {
				l -= x[i][1];
				if(l < 0) {
					okl = false;
					break;
				}
				l += x[i][0];
			}
		}
		Arrays.sort(x, (a, b) -> b[0] - a[0]);
		boolean okr = true;
		if(x[0][0]-x[0][1] < 0) {
			l += x[0][0]-x[0][1];
			if(x[0][0] != 0)
				okr = false;
		}
		for(int i = 1; i < N; i++)
			if(x[i][0]-x[i][1] < 0) {
				okr = true;
				l += x[i][0]-x[i][1];
				if(x[i][0] != 0 || x[i][1]-x[i][0] < x[i-1][0])
					okr = false;
			}
		System.out.println(okl && okr && l == 0 ? "Yes" : "No");
	}

}