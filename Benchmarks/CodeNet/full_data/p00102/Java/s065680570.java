import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n != 0) {
			int[][] num_i = new int[n + 1][n + 1];
			int[] sum_line = new int[n + 1];
			int[] sum_column = new int[n + 1];
			int total = 0;
			for (int i = 0; i < n; i++) {
				String readLine = sc.nextLine();
				String[] num_s = readLine.split(" ");
				for (int j = 0; j < n; j++) {
					int a = Integer.parseInt(num_s[j]);
					num_i[i][j] = a;
					sum_line[i] += a;
				}
				num_i[i][n] = sum_line[i];
				total += sum_line[i];
			}
			num_i[n][n] = total;
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					sum_column[k] += num_i[l][k];
				}
				num_i[n][k] = sum_column[k];
			}
			
			for (int x = 0; x < n + 1; x++) {
				StringBuilder sb = new StringBuilder();
				for (int y = 0; y < n + 1; y++) {
					String s = "" + num_i[x][y];
					while (s.length() != 5) {
						s = " " + s;
					}
					sb.append(s);
				}
				System.out.println(sb);
			}
			n = Integer.parseInt(sc.nextLine());
		}
	}
}
