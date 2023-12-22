import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] strargs = new String[3];
		int[][] A = null;
		int[][] B = null;
		int[][] C = null;
		
		strargs = br.readLine().split("\\s+");
		
		int n = Integer.parseInt(strargs[0]);
		int m = Integer.parseInt(strargs[1]);
		int l = Integer.parseInt(strargs[2]);
		
		A = new int[n][m];
		B = new int[m][l];
		C = new int[n][l];
		
		for (int i = 0; i < n; i++) {
			strargs = br.readLine().split("\\s+");
			for (int j = 0; j < m; j++) A[i][j] = Integer.parseInt(strargs[j]);
		}
		
		for (int i = 0; i < m; i++) {
			strargs = br.readLine().split("\\s+");
			for (int j = 0; j < l; j++) B[i][j] = Integer.parseInt(strargs[j]);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				sb.append(C[i][j]);
				if ( j != (l - 1)) sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}