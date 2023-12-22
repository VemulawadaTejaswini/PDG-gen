import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int n = sc.nextInt(); int m = sc.nextInt(); int l = sc.nextInt();
		int[][] row = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				row[i][j] = sc.nextInt();
			}
		}
		int[][] column = new int[m][l];
		for (int i=0; i<m; i++) {
			for (int j=0; j<l; j++) {
				column[i][j] = sc.nextInt();
			}
		}
		
		long[][] ans = calcMatrix(row, column, "*");
		
		for (int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j=0; j<l; j++) {
				sb.append((j==0?"":" ")+(ans[i][j]));
			}
			System.out.println(sb);
		}
		
	}

	static long[][] calcMatrix(int[][] row, int[][] column, String operator) {
		//計算が正常におこなえない行・列を受け取った場合のエラー処理は施してません

		int rowH = row.length; int rowW = row[0].length;
		int columnH = column.length; int columnW = column[0].length;
		long[][] result = null;

		if (operator.equals("+") || operator.equals("-")) {
			result = new long[rowH][rowW];
		}
		else if (operator.equals("-")) {
			result = new long[rowH][rowW];
		}
		else if (operator.equals("*")) {
			result = new long[rowH][columnW];
			for (int i=0; i<rowH; i++) {
				for (int j=0; j<columnW; j++) {
					long sum = 0;
					for (int k=0; k<rowW; k++) {
						sum += row[i][k] * column[k][j];
					}
					result[i][j] = sum;
				}
			}
		}
		return result;
		
	}

}
