
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n;
	while ((n = in.nextInt()) != 0) {
	    int[][] map = new int[21][21];
	    for (int i = 0; i < n; i++) {
		map[in.nextInt()][in.nextInt()] = 1;
	    }
	    int m = in.nextInt();
	    int x = 10;
	    int y = 10;
	    int count = 0;
	    for (int i = 0; i < m; i++) {
		if (count != n) {
		    char c = in.next().charAt(0);
		    int l = in.nextInt();
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
			count -= map[x][y];
			map[x][y] = 0;
			x += dx;
			y += dy;
		    }
		    count += map[x][y];
		} else {
		    in.next();
		    in.next();
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