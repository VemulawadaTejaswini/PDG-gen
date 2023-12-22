import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Solve{
	final Scanner in = new Scanner(System.in);
	final static int[] dx = {-1, 0, 1, 0};
	final static int[] dy = {0, 1, 0, -1};
	boolean solve(){
		int[][] map = new int[500][500];
		int n = in.nextInt();
		if(n == 0) return false;
		if(n == 1){
			System.out.println("1 1");
			return true;
		}
		int[][] table = new int[n][2];
		table[0][0] = 250;
		table[0][1] = 250;
		map[250][250] = 1;
		int lx = 250;
		int ly = 250;
		int rx = 250;
		int ry = 250;
		for(int i=1; i<n; i++){
			int id = in.nextInt();
			int dir = in.nextInt();
			int x = table[id][0] + dx[dir];
			int y = table[id][1] + dy[dir];
			map[y][x] = 1;
			lx = Math.min(x, lx);
			rx = Math.max(x, rx);
			ly = Math.min(y, ly);
			ry = Math.max(y, ry);
			table[i][0] = x;
			table[i][1] = y;
		}
		System.out.println((rx-lx+1)+" "+(ry-ly+1));
		return true;
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}