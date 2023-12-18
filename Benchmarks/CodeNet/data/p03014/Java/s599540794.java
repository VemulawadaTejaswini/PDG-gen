import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int H = in.nextInt(), W = in.nextInt();
	in.nextLine();
	char[][] board = new char[H][];
	for (int i = 0; i < H; i++) {
	    board[i] = in.nextLine().toCharArray();
	}
	int[][] rows = new int[H][W], cols = new int[H][W];
	for (int i = 0; i < H; i++) {
	    for(int j = 0; j < W; j++) {
		int cnt = 0;
		while(j + cnt < W && board[i][j + cnt] != '#') {
		    cnt++;
		}
		for(int k = 0; k < cnt; k++) {
		    rows[i][j + k] = cnt;
		}
		j += cnt;
	    }
	}
	for (int i = 0; i < W; i++) {
	    for(int j = 0; j < H; j++) {
		int cnt = 0;
		while(j + cnt < H && board[j + cnt][i] != '#') {
		    cnt++;
		}
		for(int k = 0; k < cnt; k++) {
		    cols[j + k][i] = cnt;
		}
		j += cnt;
	    }
	}
	int max = 0;
	for(int i = 0; i < H; i++) {
	    for(int j = 0; j < W; j++) {
		max = Math.max(max, rows[i][j] + cols[i][j] - 1);
	    }
	}
	System.out.println(max);
    }
}

