import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int k2 = 2*k;
		int[][] mat = new int[2*k][k];
		
		for (int i=0;i<n;i++) {
			int x = sc.nextInt()%k2;
			int y = sc.nextInt()%k2;
			if (y>=k) {
				y -= k;
				x = (x+k)%k2;
			}
			String s = sc.next();
			if (s.equals("W")) {
				for (int c=0;c<k2;c++) {
					for (int r=0;r<k;r++) {
						if ((((((c-x+k)/k%2)^((r-y+k)/k%2)))&1)==1)
							mat[c][r]++;
					}
				}
			} else {
				for (int c=0;c<k2;c++) {
					for (int r=0;r<k;r++) {
						if ((((((c-x+k)/k%2)^((r-y+k)/k%2)))&1)==0)
							mat[c][r]++;
					}
				}
			}
		}

		int ans = 0;
		for (int c=0;c<k2;c++) {
			for (int r=0;r<k;r++) {
				ans = Math.max(ans, mat[c][r]);
			}
		}
		
		System.out.println(ans);
	}
}