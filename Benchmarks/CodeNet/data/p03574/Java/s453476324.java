import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] inputMap = new String[h];
		String[] outputMap = new String[h];
		String word = sc.nextLine();

		for (int i = 0; i < h; i++) {
			inputMap[i] = sc.nextLine();
			System.out.println(i + ":" + inputMap[i]);
		}
		for (int i = 0; i < h; i++) {
			String outputLine = "";
			for (int j = 0; j < w; j++) {
				if (inputMap[i].substring(j, j + 1).equals(".")) {
					outputLine += getCountOfBomb(inputMap, i, j, h, w);
				} else {
					outputLine += "#";
				}
			}
			outputMap[i] = outputLine;
			System.out.println(outputLine);
		}
	}

	public static int getCountOfBomb(String[] map, int y, int x, int height, int width) {
		int count = 0;
		if (isThereBomb(map, y-1, x-1, height, width)) {
			count++;
		}
		if (isThereBomb(map, y-1, x, height, width)) {
			count++;
		}
		if (isThereBomb(map, y-1, x+1, height, width)) {
			count++;
		}
		if (isThereBomb(map, y, x-1, height, width)) {
			count++;
		}
		if (isThereBomb(map, y, x+1, height, width)) {
			count++;
		}
		if (isThereBomb(map, y+1, x-1, height, width)) {
			count++;
		}
		if (isThereBomb(map, y+1, x, height, width)) {
			count++;
		}
		if (isThereBomb(map, y+1, x+1, height, width)) {
			count++;
		}
		return count;
	}

	public static boolean isThereBomb(String[] map, int y, int x, int height, int width) {
		if (x >= 0 && x < width && y >= 0 && y < height) {
			return map[y].substring(x, x + 1).equals("#");
		} else {
			return false;
		}
	}

}
