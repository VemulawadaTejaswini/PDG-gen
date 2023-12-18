import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean mode = false;
		int targetTate = 0;
		int targetYokooko = 0;
		List<String> resMove = new ArrayList<String>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				int tmp = sc.nextInt();
				if (tmp % 2 == 1) {
					if (mode) {
						movePrint(targetTate, targetYokooko, i, j, resMove);
						mode = false;
					} else {
						mode = true;
						targetTate = i;
						targetYokooko = j;
					}
				}
			}
		}
		System.out.println(resMove.size());
		for (String move : resMove) {
			System.out.println(move);
		}
	}

	private static void movePrint(int targetTate, int targetYoko, int i, int j, List<String> resMove) {
		while (targetTate < i) {
			resMove.add(
					(targetTate + 1) + " " + (targetYoko + 1) + " " + ((++targetTate) + 1) + " " + (targetYoko + 1));
		}
		if (targetYoko < j) {
			while (targetYoko < j) {
				resMove.add((targetTate + 1) + " " + (targetYoko + 1) + " " + (targetTate + 1) + " "
						+ ((++targetYoko) + 1));
			}
		} else if (targetYoko > j) {
			while (targetYoko > j) {
				resMove.add((targetTate + 1) + " " + (targetYoko + 1) + " " + (targetTate + 1) + " "
						+ ((--targetYoko) + 1));
			}
		}
	}
}