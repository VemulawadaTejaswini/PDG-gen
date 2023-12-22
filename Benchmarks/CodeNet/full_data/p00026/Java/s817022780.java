import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int scale = 0;
		//?´?[10??10]
		int[][] math = new int[10][10];

		HashSet<Point> scopes = new HashSet<Point>();

		//??\???????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String inputStr = null;
			try {
				inputStr = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (inputStr == null || inputStr.isEmpty()) {
				break;
			}
			//??\???????????????","??§??????
			String[] inputSplitStr = inputStr.split(",");
			x = Integer.valueOf(inputSplitStr[0]);
			y = Integer.valueOf(inputSplitStr[1]);
			scale = Integer.valueOf(inputSplitStr[2]);

			scopes.clear();
			// ???????????´???????????????????¨????
			switch (scale) {
			case 1: //???????????´????°????
				scopes = calSmallScopes(x, y, scopes);
				break;
			case 2: //???????????´?????????
				scopes = calMediumScopes(x, y, scopes);
				break;
			case 3: //???????????´?????§???
				scopes = calLargeScopes(x, y, scopes);
				break;
			}

			//???????????´?????????????????????(10??10)??§????????°1??????????????????
			for (Point scope : scopes) {
				if (0 <= scope.x && scope.x < 10 && 0 <= scope.y && scope.y < 10) {
					math[scope.x][scope.y]++;
				}
			}
		}

		//???????????¶????????????????????¨?????????????????????????????????
		int whiteNumber = 0;
		int mostNumber = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (math[i][j] == 0) {
					whiteNumber++;
				}
				if (mostNumber < math[i][j]) {
					mostNumber = math[i][j];
				}
			}
		}
		System.out.println(whiteNumber);
		System.out.println(mostNumber);
	}

	private static HashSet<Point> calSmallScopes(int x, int y, HashSet<Point> scopes) {
		scopes.add(new Point(x - 1, y));
		scopes.add(new Point(x, y - 1));
		scopes.add(new Point(x, y));
		scopes.add(new Point(x, y + 1));
		scopes.add(new Point(x + 1, y));
		return scopes;
	}

	private static HashSet<Point> calMediumScopes(int x, int y, HashSet<Point> scopes) {
		scopes.add(new Point(x - 1, y - 1));
		scopes.add(new Point(x - 1, y));
		scopes.add(new Point(x - 1, y + 1));

		scopes.add(new Point(x, y - 1));
		scopes.add(new Point(x, y));
		scopes.add(new Point(x, y + 1));

		scopes.add(new Point(x + 1, y - 1));
		scopes.add(new Point(x + 1, y));
		scopes.add(new Point(x + 1, y + 1));
		return scopes;
	}

	private static HashSet<Point> calLargeScopes(int x, int y, HashSet<Point> scopes) {
		scopes.add(new Point(x - 2, y));

		scopes.add(new Point(x - 1, y - 1));
		scopes.add(new Point(x - 1, y));
		scopes.add(new Point(x - 1, y + 1));

		scopes.add(new Point(x, y - 2));
		scopes.add(new Point(x, y - 1));
		scopes.add(new Point(x, y));
		scopes.add(new Point(x, y + 1));
		scopes.add(new Point(x, y + 2));

		scopes.add(new Point(x + 1, y - 1));
		scopes.add(new Point(x + 1, y));
		scopes.add(new Point(x + 1, y + 1));

		scopes.add(new Point(x + 2, y));
		return scopes;
	}
}