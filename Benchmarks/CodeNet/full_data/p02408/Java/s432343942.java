import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			boolean[][] cards = new boolean[4][13];
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 13; j++) {
					cards[i][j] = false;
				}
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
				
			int n = Integer.parseInt(s);
			String[] trump;
			int num = 0;
			for (int k = 0; k < n; k++) {
				String t = reader.readLine();
				trump = t.split(" ");
				num = Integer.parseInt(trump[1]);
				if ("S".equals(trump[0])) {
					cards[0][num - 1] = true;
				} else if ("H".equals(trump[0])) {
					cards[1][num - 1] = true;
				} else if ("C".equals(trump[0])) {
					cards[2][num - 1] = true;
				} else if ("D".equals(trump[0])) {
					cards[3][num - 1] = true;
				}
			}
			
			String[] picture = {"S", "H", "C", "D"};
			
			for (int l = 0; l < 4; l++) {
				for (int m = 0; m < 13; m++) {
					if (!cards[l][m]) {
						System.out.print(picture[l] + " ");
						System.out.println(m + 1);
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}