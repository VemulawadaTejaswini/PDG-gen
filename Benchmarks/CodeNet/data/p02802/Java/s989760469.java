import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
	int[][] b = new int[n][3];
	for (int i = 0; i < m; i++) {
		int p = sc.nextInt();
		String s = sc.next();
		if (b[p - 1][0] == 0) {
			if ("AC".equals(s)) {
				b[p - 1][0] = i + 1;
			} else {
				b[p - 1][1]++;
			}
		}
	}
	int ok = 0;
	int ng = 0;
	for (int i = 0; i < n; i++) {
		if (b[i][0] > 0) {
			ok++;
			ng += b[i][1];
		}
	}
	System.out.println(ok + " " + ng);
  }
}