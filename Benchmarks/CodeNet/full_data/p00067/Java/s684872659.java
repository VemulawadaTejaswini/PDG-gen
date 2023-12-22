

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????¨?¨????????????°?????¨???
		final int VERTICALLIMIT = 12;
		final int SIDELIMIT = 12;

		Scanner in = new Scanner(System.in);
		//
		String[][] worldMap = new String[VERTICALLIMIT][SIDELIMIT];
		int count = 0;
		ArrayList<Integer> packmanCount = new ArrayList<>();

		while (in.hasNext()) {

			for (int verticalNum = 0; verticalNum < VERTICALLIMIT; verticalNum++) {

				String world = in.next();

				for (int sideNum = 0; sideNum < SIDELIMIT; sideNum++) {

					worldMap[verticalNum] = world.split("");

				}
			}

			for (int verticalNum = 0; verticalNum < VERTICALLIMIT; verticalNum++) {

				for (int sideNum = 0; sideNum < SIDELIMIT; sideNum++) {

					if (worldMap[verticalNum][sideNum].equals("1")) {

						packman(worldMap, verticalNum, sideNum);

						count++;

					}
				}
			}

			packmanCount.add(count);
			count = 0;

		}

		for(int result: packmanCount) {

			System.out.println(result);

		}

	}

	private static void packman(String[][] worldMap, int verticalNum, int sideNum) {

		// ????????????????????????????\???????????????¨????????°
		final int VERTICALZERO = 0;
		final int VERTICALLIMIT = 11;
		final int SIDEZERO = 0;
		final int SIDELIMIT = 11;

		if (worldMap[verticalNum][sideNum].equals("1")) {

			worldMap[verticalNum][sideNum] = "0";

			if (verticalNum > VERTICALZERO) {

				packman(worldMap, verticalNum - 1, sideNum);

			}

			if (verticalNum < VERTICALLIMIT) {

				packman(worldMap, verticalNum + 1, sideNum);

			}

			if (sideNum > SIDEZERO) {

				packman(worldMap, verticalNum, sideNum - 1);

			}

			if (sideNum < SIDELIMIT) {

				packman(worldMap, verticalNum, sideNum + 1);

			}

		} else {

			return;

		}
	}
}


// ==============================?????°???????????????=======================================

  /*if(worldMap[i + 1][j] == 0 && worldMap[i - 1][j] == 0 && worldMap[i][j + 1] == 0 && worldMap[i][j - 1] == 0) {

	  worldMap[i][j] = 0;

  } else if(worldMap[i + 1][j] == 1 || worldMap[i - 1][j] != 0 || worldMap[i][j + 1] != 0 || worldMap[i][j - 1] != 0){

	  packman(worldMap, i + 1, j);

  } else if(worldMap[j + 1][j] == 1 && worldMap[i + 1][j] == 0 || worldMap[i - 1][j] != 0 || worldMap[i][j - 1] != 0) {

	  packman(worldMap, i, j + 1);

  } else if(worldMap[i][j - 1] == 1 && worldMap[i + 1][j] == 0 || worldMap[i - 1][j] != 0 || worldMap[i][j - 1] != 0){

	  packman(worldMap, i, j - 1);

  } else if(worldMap[i][i - 1] == 1 && worldMap[i + 1][j] == 0 || worldMap[i][j + 1] != 0 || worldMap[i][j - 1] != 0){

	  packman(worldMap, i - 1, j);

  }

  	worldMap[i][j] = 0;*/