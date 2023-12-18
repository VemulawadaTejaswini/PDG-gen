import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tok = in.readLine().split(" ");
		int h = Integer.parseInt(tok[0]);
		int w = Integer.parseInt(tok[1]);
		String[] lines = new String[h];
		for(int i = 0; i < h; ++i){
			lines[i] = in.readLine();
		}

		int m = 610;
		boolean[][] exist = new boolean[m][m];
		for(int i = 0; i < h; ++i)
		for(int j = 0; j < w; ++j)
		if(lines[i].charAt(j) == '#'){
			exist[i + j + 2][i - j + 302] = true;
		}
		int[][] sumh = new int[m][m], sumv = new int[m][m];
		for(int i = 1; i < m; ++i)
		for(int j = 1; j < m; ++j){
			int t = exist[i][j] ? 1 : 0;
			sumh[i][j] = sumh[i][j - 1] + t;
			sumv[i][j] = sumv[i - 1][j] + t;
		}
		
		long res1 = 0, res2 = 0;
		for(int y1 = 0; y1 < m; ++y1)
		for(int x1 = y1 & 1; x1 < m; x1 += 2)
		if(exist[y1][x1]){
			for(int x2 = x1 + 2; x2 < m; x2 += 2)
			if(exist[y1][x2]){
				int d = x2 - x1;
				for(int s = -1; s <= 1; s += 2){
					int y2 = y1 + d * s;
					if(y2 < 0 || y2 >= m){ continue; }
					res1 += exist[y2][x1] ? 1 : 0;
					res1 += exist[y2][x2] ? 1 : 0;
					res2 += sumh[y2][x2 - 1] - sumh[y2][x1];
				}
			}
			for(int y2 = y1 + 2; y2 < m; y2 += 2)
			if(exist[y2][x1]){
				int d = y2 - y1;
				for(int s = -1; s <= 1; s += 2){
					int x2 = x1 + d * s;
					if(x2 < 0 || x2 >= m){ continue; }
					res1 += exist[y1][x2] ? 1 : 0;
					res1 += exist[y2][x2] ? 1 : 0;
					res2 += sumv[y2 - 1][x2] - sumv[y1][x2];
				}
			}
		}
		
		System.out.println(res1 / 2 + res2);
	}
}
