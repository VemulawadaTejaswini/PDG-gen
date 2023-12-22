import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		int[][] dice = new int[4][4];
		dice[0][0] = 2; dice[0][1] = 1; dice[0][2] = 5; dice[0][3] = 6;
		dice[1][0] = 4; dice[1][1] = 2; dice[1][2] = 3; dice[1][3] = 5;
		dice[2][0] = 5; dice[2][1] = 6; dice[2][2] = 2; dice[2][3] = 1;
		dice[3][0] = 3; dice[3][1] = 5; dice[3][2] = 4; dice[3][3] = 2;
		int y = 0;
		int x = 1;
		String roll = br.readLine();
		for (int i = 0; i < roll.length(); i++) {
			switch (roll.substring(i, i + 1)) {
			case "N":
				y -= 1;
				if (y < 0) y = 3;
				break;
			case "E":
				x -= 1;
				if (x < 0) x = 3;
				break;
			case "S":
				y += 1;
				if (3 < y) y = 0;
				break;
			case "W":
				x += 1;
				if (3 < x) x = 0;
				break;
			}
		}
		System.out.println(strAry[dice[y][x] - 1]);
	}
}