import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String N;
	while (!(N = br.readLine()).equals("0")) {
	    int n = Integer.parseInt(N);
	    int[][] map = new int[21][21];
	    for (int i = 0; i < n; i++) {
		String[] s = br.readLine().split(" ");
		map[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = 1;

	    }
	    int m = Integer.parseInt(br.readLine());
	    int x = 10;
	    int y = 10;
	    int count = 0;
	    for (int i = 0; i < m; i++) {
		if (count != n) {
		    String[] s = br.readLine().split(" ");
		    char c = s[0].charAt(0);
		    int l = Integer.parseInt(s[1]);
		    int dx = 0;
		    int dy = 0;
		    if (c == 'N') {
			dy = 1;
		    } else if (c == 'E') {
			dx = 1;
		    } else if (c == 'S') {
			dy = -1;
		    } else if (c == 'W') {
			dx = -1;
		    }
		    for (int j = 0; j < l; j++) {
			count += map[x][y];
			map[x][y] = 0;
			x += dx;
			y += dy;
		    }
		    count += map[x][y];
		    map[x][y] = 0;
		} else {
		    br.readLine();
		}
	    }
	    if (count == n) {
		System.out.println("Yes");
	    } else {
		System.out.println("No");
	    }
	}
    }
}