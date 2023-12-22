import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			
			int[][] result = new int[500][10];
			
			String[] line;
			int setOld = 0;
			int[] setCount = new int[50];
			int k = 0;
			
			while(N != 0) {
				
				setCount[k] = N;
				for (int i = 0; i < N; i++) {
					line = br.readLine().split(" ");
					for (int j = 0; j < line.length; j++) {
						result[setOld + i][j] = Integer.parseInt(line[j]);
						result[setOld + i][line.length] += Integer.parseInt(line[j]);
						result[setOld + N][j] += Integer.parseInt(line[j]);
					}
					result[setOld + N][line.length] += result[setOld + i][line.length];
				}
				setOld++;
				setOld += N;
				N = Integer.parseInt(br.readLine());
				k++;
			}
			int p = 0;
			while(setCount[p] != 0) {
				for (int m = 0; m < setCount[p] + 1; m++) {
					for (int n = 0; n < setCount[p] + 1; n++) {
						System.out.print(String.format("%4d", result[m][n]));
					}
					System.out.println("");
				}
				p++;
			}
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
}