import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean[][] v = new boolean[N][N];
		for(int i=0; i<N; i++) {
			char[] s = sc.next().toCharArray();
			for(int j=0; j<N; j++)
				v[i][j] = s[j]=='#';
		}
		
		int filledColumn = 0;
		boolean atLeastOneBlack = false;
		for(int i=0; i<N; i++) {
			boolean ok = true;
			for(int j=0; j<N; j++) {
				atLeastOneBlack |= v[j][i];
				ok &= v[j][i];
			}
			if(ok)
				filledColumn++;
		}

		if(!atLeastOneBlack) {
			System.out.println(-1);
			sc.close();
			return;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			boolean found = false;
			for(int j=0; j<N; j++) {
				if(v[j][i]) {
					found = true;
					break;
				}
			}
			int needToPaint = 0;
			for(int j=0; j<N; j++) {
				if(!v[i][j])
					needToPaint++;
			}
			ans = Math.min(ans, (found ? 0 : 1) + needToPaint + N - filledColumn);
		}
		
		System.out.println(ans);
		sc.close();
	}
}

