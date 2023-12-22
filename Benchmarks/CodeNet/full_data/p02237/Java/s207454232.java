import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] adj = new int[n][n];

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j=2; j<str.length; j++) {
				adj[Integer.parseInt(str[0])-1][Integer.parseInt(str[j])-1] = 1;
			}
		}

		for (int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j=0; j<n; j++) {
				sb.append(" ").append(adj[i][j]);
			}
			System.out.println(sb);
		}

		br.close();
	}
}