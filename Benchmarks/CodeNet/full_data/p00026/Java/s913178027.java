import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] math;
	static final int MATH_LENGTH = 10;

	public static void main(String[] args) throws IOException {
		//?????°????????????
		math = new int[10][10];
		int x = 0, y = 0;
		int scale;

		//??\???????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		while (true) {
			inputStr = br.readLine();
			if (inputStr == null || inputStr.isEmpty()) {
				break;
			}
			//??\???????????????","??§??????
			String[] inputSplitStr = inputStr.split(",");
			x = Integer.valueOf(inputSplitStr[0]);
			y = Integer.valueOf(inputSplitStr[1]);
			scale = Integer.valueOf(inputSplitStr[2]);

			// ???????????´???????????????????¨????
			switch (scale) {
			case 1: //???????????´????°????
				setSmallInk(x, y);
				break;
			case 2: //???????????´?????????
				setMediumInk(x, y);
				break;
			case 3: //???????????´?????§???
				setLargeInk(x, y);
				break;
			}
		}
		//???????????¶????????????????????¨?????????????????????????????????
		int whiteNumber = 0;
		int mostNumber = 0;
		for (int i = 0; i < MATH_LENGTH; i++) {
			for (int j = 0; j < MATH_LENGTH; j++) {
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

	private static void setSmallInk(int x, int y) {
		math[x][y]++;
		if ((x - 1) >= 0) {
			math[x - 1][y]++;
		}
		if ((y - 1) >= 0) {
			math[x][y - 1]++;
		}
		if (MATH_LENGTH > (x + 1)) {
			math[x + 1][y]++;
		}
		if (MATH_LENGTH > (y + 1)) {
			math[x][y + 1]++;
		}
	}

	private static void setMediumInk(int x, int y) {
		math[x][y]++;
		if ((x - 1) >= 0) {
			math[x - 1][y]++;
			if ((y - 1) >= 0) {
				math[x - 1][y - 1]++;
			}
			if (MATH_LENGTH > (y + 1)) {
				math[x - 1][y + 1]++;
			}
		}
		if ((y - 1) >= 0) {
			math[x][y - 1]++;
		}
		if (MATH_LENGTH > (y + 1)) {
			math[x][y + 1]++;
		}
		if (MATH_LENGTH > (x + 1)) {
			math[x + 1][y]++;
			if ((y - 1) >= 0) {
				math[x + 1][y - 1]++;
			}
			if (MATH_LENGTH > (y + 1)) {
				math[x + 1][y + 1]++;
			}
		}
	}

	private static void setLargeInk(int x, int y) {
		math[x][y]++;
		if ((x - 2) >= 0) {
			math[x - 2][y]++;
		}
		if (MATH_LENGTH > (x + 2)) {
			math[x + 2][y]++;
		}
		if ((y - 2) >= 0) {
			math[x][y - 2]++;
		}
		if (MATH_LENGTH > (y + 2)) {
			math[x][y + 2]++;
		}
		if ((x - 1) >= 0) {
			math[x - 1][y]++;
			if ((y - 1) >= 0) {
				math[x - 1][y - 1]++;
			}
			if (MATH_LENGTH > (y + 1)) {
				math[x - 1][y + 1]++;
			}
		}
		if ((y - 1) >= 0) {
			math[x][y - 1]++;
		}
		if (MATH_LENGTH > (y + 1)) {
			math[x][y + 1]++;
		}
		if (MATH_LENGTH > (x + 1)) {
			math[x + 1][y]++;
			if ((y - 1) >= 0) {
				math[x + 1][y - 1]++;
			}
			if (MATH_LENGTH > (y + 1)) {
				math[x + 1][y + 1]++;
			}
		}
	}
}