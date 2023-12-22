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
	    /*
	    if (i % 2 == 0) {
		Arrays.fill(grid[i], 1);
		for (int j = 0; j < 4; j++) {
		    int c = line.charAt(j) - '0';
		    grid[i][j * 2 + 1] = c;
		}
	    } else {
		for (int j = 0; j < 5; j++) {
		    int c = line.charAt(j) - '0';
		    grid[i][j * 2] = c;
		}
	    }
	    */
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
	/*
	for (int i = 0; i < 9; i++) {
	    for (int j = 0; j < 9; j++) {
		System.out.print(grid[i][j]);
	    }
	    System.out.println();
	}
	*/
	solve();
	//System.out.println();
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
	/*
	int[] data = new int[2];
	int count = 0;
	while (true) {
	    data = move(width, height, direction);
	    width = data[0];
	    height = data[1];
	    direction = nextDirection(width, height, direction);
	    if (width == 0 && height == 0) {
		break;
	    }
	}
	*/
    }
    
    static int[] move (int width, int height, int direction) {
	int[] data = new int[2];
	if (direction == 0) {
	    data = moveRight(width, height);
	} else if (direction == 1) {
	    data = moveLeft(width, height);
	} else if (direction == 2) {
	    data = moveUp(width, height);
	} else if (direction == 3) {
	    data = moveDown(width, height);
	}
	return data;

    }

    static int[] moveRight (int width, int height) {
	int[] data = new int[2];
	while (width+2 < MAX_WIDTH && grid[height][width+2] == 1 && grid[height][width+1] == 1) {
	    width+=2;
	    System.out.print("R");
	}
	data[0] = width;
	data[1] = height;
	return data;
    }

    static int[] moveLeft (int width, int height) {
	int[] data = new int[2];
	while (width-2 >= 0 && grid[height][width-2] == 1 && grid[height][width-1] == 1) {
	    width-=2;
	    System.out.print("L");
	}
	data[0] = width;
	data[1] = height;
	return data;
    }

    static int[] moveUp (int width, int height) {
	int[] data = new int[2];
	while (height-2 >= 0 && grid[height-2][width] == 1 && grid[height-1][width] == 1) {
	    height -=2;
	    System.out.print("U");
	}
	data[0] = width;
	data[1] = height;
	return data;
    }

    static int[] moveDown (int width, int height) {
	int[] data = new int[2];
	while (height+2 < MAX_HEIGHT && grid[height+2][width] == 1 && grid[height+1][width] == 1) {
	    height +=2;
	    System.out.print("D");
	}
	data[0] = width;
	data[1] = height;
	return data;
    }

    static int nextDirection (int width, int height, int prevDirection) {
	int next = 0;
	if (prevDirection == 0 || prevDirection == 1) {
	    if (isUp(width, height)) {
		next = 2;
	    } else if (isDown(width, height)) {
		next = 3;
	    }
	} else if (prevDirection == 2 || prevDirection == 3) {
	    if (isRight(width, height)) {
		next = 0;
	    } else if (isLeft(width, height)) {
		next = 1;
	    }
	}
	return next;
    }

    static boolean isUp (int width, int height) {
	if (height == 0) {
	    return false;
	}
	if (grid[height - 1][width] == 1) {
	    return true;
	} else {
	    return false;
	}
    }


    static boolean isDown (int width, int height) {
	if (height == MAX_HEIGHT - 1) {
	    return false;
	}
	if (grid[height+1][width] == 1) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isRight (int width, int height) {
	if (width == MAX_WIDTH - 1) {
	    return false;
	}
	if (grid[height][width + 1] == 1) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isLeft (int width, int height) {
	if (width == 0) {
	    return false;
	}
	if (grid[height][width - 1] == 1) {
	    return true;
	} else {
	    return false;
	}
    }
}