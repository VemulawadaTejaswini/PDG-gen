import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[][] density = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				density[i][j] = 0;
			}
		}
		while (str!=null) {
			String[] dataset = str.split(",");
			int x = Integer.parseInt(dataset[0]);
			int y = Integer.parseInt(dataset[1]);
			int s = Integer.parseInt(dataset[2]);
			density[x][y] += 1;
			if (x - 1 >= 0)
				density[x - 1][y] += 1;
			if (x + 1 <= 10)
				density[x + 1][y] += 1;
			if (y - 1 >= 0)
				density[x][y - 1] += 1;
			if (y + 1 <= 10)
				density[x][y + 1] += 1;
			if (s >= 2) {
				if (x - 1 >= 0 && y - 1 >= 0)
					density[x - 1][y - 1] += 1;
				if (x - 1 >= 0 && y + 1 <= 10)
					density[x - 1][y + 1] += 1;
				if (x + 1 <= 10 && y - 1 >= 0)
					density[x + 1][y - 1] += 1;
				if (x + 1 <= 10 && y + 1 <= 10)
					density[x + 1][y + 1] += 1;
			}
			if (s == 3) {
				if (x - 2 >= 0)
					density[x - 2][y] += 1;
				if (x + 2 <= 10)
					density[x + 2][y] += 1;
				if (y - 2 >= 0)
					density[x][y - 2] += 1;
				if (y + 2 <= 10)
					density[x][y + 2] += 1;
			}
			str = br.readLine();
		}
		int cnt = 0;
		int max = 0;
		for (int[] column : density) {
			for (int densities : column) {
				if (densities > max)
					max = densities;
				else if (densities == 0)
					cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
}