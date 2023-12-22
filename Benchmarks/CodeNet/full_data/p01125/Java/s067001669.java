import java.util.Scanner;

class Robo {
	int coordinateX;
	int coordinateY;

	Robo() {
		this.coordinateX = 10;
		this.coordinateY = 10;
	}

	public void forwardX() {
		this.coordinateX = (this.getX() + 1);
	}

	public void forwardY() {
		this.coordinateY = (this.getY() + 1);
	}

	public void backwardX() {
		this.coordinateX = (this.getX() - 1);
	}

	public void backwardY() {
		this.coordinateY = (this.getY() - 1);
	}

	public int getX() {
		return this.coordinateX;
	}

	public int getY() {
		return this.coordinateY;
	}
}

class Gem {
	int coordinateX;
	int coordinateY;

	public void setX(int x) {
		this.coordinateX = x;
	}

	public void setY(int y) {
		this.coordinateY = y;
	}

	public int getX() {
		return this.coordinateX;
	}

	public int getY() {
		return this.coordinateY;
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			int numOfGems = scan.nextInt();
			if (numOfGems == 0) {
				break;
			}

			int numOfGemsCollected = 0;
			Robo robo = new Robo();

			Gem[] gemArray = new Gem[numOfGems];

			for (int i = 0; i < numOfGems; i++) {
				Gem gem = new Gem();
				int xOfGem = scan.nextInt();
				int yOfGem = scan.nextInt();

				gem.setX(xOfGem);
				gem.setY(yOfGem);

				gemArray[i] = gem;
			}

			//動く回数を読み込み
			int numOfMoves = scan.nextInt();

			//動く回数分だけ、方向読み込み→距離読み込みを繰り返し
			for (int m = 0; m < numOfMoves; m++) {
				String direction = scan.next();
				int distance = scan.nextInt();

				//東ならX座標を＋１
				if (direction.equals("E")) {
					for (int j = 0; j <= distance; j++) {
						robo.forwardX();
						for (int i = 0; i < numOfGems; i++) {
							if ((robo.getX() == gemArray[i].getX()) && (robo.getY() == gemArray[i].getY())) {
								numOfGemsCollected++;
							}
						}
					}
				}

				//西ならX座標をー１
				if (direction.equals("W")) {
					for (int j = 0; j < distance; j++) {
						robo.backwardX();
						for (int i = 0; i < numOfGems; i++) {
							if ((robo.getX() == gemArray[i].getX()) && (robo.getY() == gemArray[i].getY())) {
								numOfGemsCollected++;
							}
						}
					}
				}

				//北ならY座標を＋１
				if (direction.equals("N")) {
					for (int j = 0; j < distance; j++) {
						robo.forwardY();
						for (int i = 0; i < numOfGems; i++) {
							if ((robo.getX() == gemArray[i].getX()) && (robo.getY() == gemArray[i].getY())) {
								numOfGemsCollected++;
							}
						}
					}
				}

				//南ならY座標をー１
				if (direction.equals("S")) {
					for (int j = 0; j < distance; j++) {
						robo.backwardY();
						for (int i = 0; i < numOfGems; i++) {
							if ((robo.getX() == gemArray[i].getX()) && (robo.getY() == gemArray[i].getY())) {
								numOfGemsCollected++;
							}
						}
					}
				}
			}

			if (numOfGems == numOfGemsCollected) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		scan.close();
	}
}

