
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		final int X = 0;
		final int Y = 1;
		final int SIZE = 2;
		int countAxis = 0;
		int maxThickness = 0;

		// ?????£???(??¨??????0??§??????)??§?¨??????????
		int[][] axis = new int[10][10];
		for (int countX = 0; countX < 10; countX++) {
			for (int countY = 0; countY < 10; countY++) {
				axis[countX][countY] = 0;
			}
		}
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// ???????????????
		while (true) {

			String inputData = input.readLine();

			if (inputData == null || inputData.equals("")) {
				break;
			}

			String[] data = inputData.split(",");

			if (Integer.parseInt(data[SIZE]) == 1) {
				makeSmallArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));
			}

			if (Integer.parseInt(data[SIZE]) == 2) {
				makeMiddleArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));

			}

			if (Integer.parseInt(data[SIZE]) == 3) {
				makeBigArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));

			}
			countAxis = 0;
			for (int countX = 0; countX < 10; countX++) {
				for (int countY = 0; countY < 10; countY++) {
					if (axis[countX][countY] == 0) {
						countAxis++;
					}
					if (axis[countX][countY] > maxThickness) {
						maxThickness = axis[countX][countY];
					}

				}
			}

		}
		System.out.println(countAxis);
		System.out.println(maxThickness);
	}

	static void makeSmallArea(int[][] axis, int xAxis, int yAxis) {
		axis[xAxis][yAxis]++;
		axis[xAxis][yAxis + 1]++;
		axis[xAxis + 1][yAxis]++;
		axis[xAxis][yAxis - 1]++;
		axis[xAxis - 1][yAxis]++;

	}

	static void makeMiddleArea(int[][] axis, int xAxis, int yAxis) {
		makeSmallArea(axis, xAxis, yAxis);
		axis[xAxis + 1][yAxis + 1]++;
		axis[xAxis + 1][yAxis - 1]++;
		axis[xAxis - 1][yAxis + 1]++;
		axis[xAxis - 1][yAxis - 1]++;

	}

	static void makeBigArea(int[][] axis, int xAxis, int yAxis) {
		makeMiddleArea(axis, xAxis, yAxis);
		axis[xAxis][yAxis + 2]++;
		axis[xAxis][yAxis - 2]++;
		axis[xAxis + 2][yAxis]++;
		axis[xAxis - 2][yAxis]++;

	}

}