import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		String[][] A = new String[H][W];
		int [] HH = new int[H* W];
		int[] WW = new int[H * W];
		int count = 0;
		for (int i = 0; i < H; i++) {
			String[] str2 = reader.readLine().split("");
			for (int j = 0; j < str2.length; j++) {
				A[i][j] = str2[j];
				if (A[i][j].equals("#")) {
					HH[count] = i;
					WW[count] = j;
					count++;
				}
			}
		}
		int max = -1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (A[i][j].equals(".")) {
					int local_min = Integer.MAX_VALUE;
					for (int c = 0; c < count; c++) {   //////////////
						if (Math.abs(HH[c]-i) + Math.abs(WW[c]-j) < local_min) {
							local_min = Math.abs(HH[c]-i) + Math.abs(WW[c]-j);
						}
					}
					if (local_min > max) {
						max = local_min;
					}
				}
			}
		}
		System.out.println(max);
	}
}