//--- pB ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution() {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		// String line = scanner.nextLine();
		// int N = Integer.parseInt(line.split("\\s+")[0]);
		// int K = Integer.parseInt(line.split("\\s+")[1]);
		int[][] grid = new int[3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				grid[i][j] = ni();
			}
			// grid[i] = strToIntArray(scanner.nextLine());
		}

		boolean[][] choosen = new boolean[3][3];

		// String line = scanner.nextLine();
		// int N = Integer.parseInt(line.split("\\s+")[0]);
		int N = ni();
		for (int i=0; i<N; i++) {
			// int t = Integer.parseInt(scanner.nextLine());
			int t = ni();
			for (int u=0; u<3; u++) {
				for (int v=0; v<3; v++) {
					if (grid[u][v] == t) {
						choosen[u][v] = true;
					}
				}
			}
		}

		// Check
		for (int i=0; i<3; i++) {
			int cnt = 0;
			for (int j=0; j<3; j++) {
				if (choosen[i][j]) cnt++;
			}
			if (cnt == 3) {
				System.out.println("Yes");
				return;
			}
		}

		for (int i=0; i<3; i++) {
			int cnt = 0;
			for (int j=0; j<3; j++) {
				if (choosen[j][i]) cnt++;
			}
			if (cnt == 3) {
				System.out.println("Yes");
				return;
			}
		}

		int cnt = 0;
		for (int i=0; i<3; i++) {
			if (choosen[i][i]) cnt++;
		}
		if (cnt == 3) {
			System.out.println("Yes");
			return;
		}

		cnt = 0;
		for (int i=0; i<3; i++) {
			if (choosen[2-i][i]) cnt++;
		}
		if (cnt == 3) {
			System.out.println("Yes");
			return;
		}


		System.out.println("No");
		return;
	}
	private int ni() {return Integer.parseInt(reader.next());}
	private String ns() {return reader.next();}
}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			return br.ready();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
