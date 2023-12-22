import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	int count = 1;
	
	void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dataSet = br.readLine().split(" ");
		int W = Integer.parseInt(dataSet[0]);
		int H = Integer.parseInt(dataSet[1]);
		
		List<Integer> result = new ArrayList<Integer>();
		
		while (W != 0 || H != 0) {
			int startW = 0;
			int startH = 0;
			char[][] tile = new char[H][W];
			for (int i = 0; i < H; i++) {
				String line = br.readLine();
				for (int j = 0; j < W; j++) {
					tile[i][j] = line.charAt(j);
					if (line.charAt(j) == '@') {
						startW = i; 
						startH = j;
					}
				}
			}
			trace(startW, startH, tile, H, W);
			result.add(count);
			count = 1;
			dataSet = br.readLine().split(" ");
			W = Integer.parseInt(dataSet[0]);
			H = Integer.parseInt(dataSet[1]);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	void trace(int i, int j, char tile[][], int H, int W) {
		int up = 0;
		int down = 0;
		int right = 0;
		int left = 0;
		
		// ??????????????¢?´¢
		if (i - 1 >= 0) {
			if (tile[i - 1][j] == '.') {
				count++;
				tile[i - 1][j] = '%';
				up = i - 1;
				trace(up, j, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (j + 1 < W) {
			if (tile[i][j + 1] == '.') {
				count++;
				tile[i][j + 1] = '%';
				right = j + 1;
				trace(i, right, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (i + 1 < H) {
			if (tile[i + 1][j] == '.') {
				count++;
				tile[i + 1][j] = '%';
				down = i + 1;
				trace(down, j, tile, H, W);
			}
		}
		// ??????????????¢?´¢
		if (j - 1 >= 0) {
			if (tile[i][j - 1] == '.') {
				count++;
				tile[i][j - 1] = '%';
				left = j - 1;
				trace(i, left, tile, H, W);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new Main().run();
	}

}