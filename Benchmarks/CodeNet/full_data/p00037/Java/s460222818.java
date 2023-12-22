import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static int[][] grid;
    static int MAX_HEIGHT = 9;
    static int MAX_WIDTH = 9;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	grid = new int[MAX_HEIGHT][MAX_WIDTH];
	String line;
	int width, n, pos;
	for (int i = 0; i < 9; i++) {
	    line = scan.nextLine();
	    width = 0;
	    for (int j = 0; j < line.length(); j++) {
		n = Integer.parseInt(line.substring(j, j+1));
		if (n == 0) {
		    continue;
		}
		if (i % 2 == 0) {
		    pos = j * 2;
		    grid[i][pos] = 1;
		    grid[i][pos+1] = 1;
		    grid[i][pos+2] = 1;
		} else {
		    pos = j*2;
		    grid[i-1][pos] = 1;
		    grid[i][pos] = 1;
		    grid[i+1][pos] = 1;
		}
	    }
	}
	solve();
    }
    
    static void solve () {
	StringBuilder sb = new StringBuilder();
	int width = 0, height = 0, direction = 0;
	int[] dwidth = {1, 0, -1, 0};
	int[] dheight = {0, 1, 0, -1};
	String[] textdirection = {"R", "D", "L", "U"};
	
	while (true) {
	    for (int i = 3; i < 7; i++) {
		int nextwidth = width + dwidth[(i + direction) % 4];
		int nextheight = height + dheight[(i + direction) % 4];
		int nextnextwidth = nextwidth + dwidth[(i + direction) % 4];
		int nextnextheight = nextheight + dheight[(i + direction) % 4];
		if (!(0 <= nextwidth && nextwidth < MAX_WIDTH && 0 <= nextheight && nextheight < MAX_HEIGHT)) {
		    continue;
		}
		if (!(0 <= nextnextwidth && nextnextwidth < MAX_WIDTH && 0 <= nextnextheight && nextnextheight < MAX_HEIGHT)) {
		    continue;
		}
		if (grid[nextheight][nextwidth] == 0 || grid[nextnextheight][nextnextwidth] == 0) {
		    continue;
		}
		width = nextnextwidth;
		height = nextnextheight;
		direction = (i + direction) % 4;
		sb.append(textdirection[direction]);
		break;
	    }
	    if (width == 0 && height == 0) {
		break;
	    }
	}
	System.out.println(sb.toString());
    }