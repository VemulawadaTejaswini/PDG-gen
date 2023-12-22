import java.util.Scanner;

public class Main {

	class Island {

		int[][] map = new int[14][14];
		int num = 2;

		public Island(int[][] map) {
			this.map = map;
		}

		private void label(int row, int column) {
			map[row][column] = num;
			for(int i=0; i<4; i++) {
				if(i==0) {
					if(map[row][column-1] == 1) label(row, column-1);
				} else if(i == 1) {
					if(map[row-1][column] == 1) label(row-1, column);
				} else if(i == 2) {
					if(map[row][column+1] == 1) label(row, column+1);
				} else if(i == 3) {
					if(map[row+1][column] == 1) label(row+1, column);
				}
			}
		}

		public int count() {
			for(int i=1; i<13; i++) {
				for(int j=1; j<13; j++) {
					if(map[i][j] == 1) {
						num++;
						label(i, j);
					}
				}
			}
			return num-2;
		}

	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {

			int[][] map = new int[14][14];

			// 外を埋める
			for(int i=0; i<14; i++) {
				map[0][i] = 0;
				map[13][i] = 0;
				map[i][0] = 0;
				map[i][13] = 0;
			}

			for(int i=1; i<13; i++) {
				String line = sc.next();
				for(int j=1; j<13; j++) {
					map[i][j] = Integer.parseInt(line.split("")[j-1]);
				}
			}

			Island island = new Main().new Island(map);
			System.out.println(island.count());
		}

		sc.close();


	}
