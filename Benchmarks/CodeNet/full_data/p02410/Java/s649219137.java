import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author cthanh
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = 0, m = 0;
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		int kakezan =0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				str = br.readLine().split(" ");
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int k = 0; k < m; k++) {
			String str1 = br.readLine();
			vector[k] = Integer.parseInt(str1);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				kakezan += matrix[i][j]*vector[j];
				
			}
			System.out.println(kakezan);
		}

	
	}

}