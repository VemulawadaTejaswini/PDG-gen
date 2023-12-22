import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			StringBuilder answer = new StringBuilder();
			String lb = System.getProperty("line.separator");
			long sum = 0;
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String[] nm = input.readLine().split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			ArrayList<String[]> matrix = new ArrayList<String[]>(n);
			for (int i = 0; i < n; i++) {
				matrix.add(input.readLine().split(" "));
			}
			String[] vector = new String[m];
			for (int i = 0; i < m; i++) {
				vector[i] = input.readLine();
			}
			for (int i = 0; i < n; i++) {
				String[] column = matrix.remove(0);
				sum = 0;
				for (int j = 0; j < m; j++) {
					sum += Integer.parseInt(column[j]) * Integer.parseInt(vector[j]);
				}
				answer.append(String.valueOf(sum)).append(lb);
			}
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}