import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private class Position {
		int x;
		int y;

		Position() {
		}

		Position(int x, int y) {
			setPosition(x, y);
		}

		void setPosition(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int getDistance(Position target) {
			return Math.abs(this.x - target.x) + Math.abs(this.y - target.y);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Position)) {
				return false;
			}
			Position other = (Position) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

	private Position currentPosition = new Position();
	private int currentSecond;

	public boolean isEven(int number) {
		return (number % 2 == 0);
	}

	public boolean isAvailablePlan(int second, int positionX, int positionY) {
		Position targetPostion = new Position(positionX, positionY);
		int distance = currentPosition.getDistance(targetPostion);
		int time = second - currentSecond;
		if (distance > time) {
			return false;
		}
		if (distance == time) {
			return true;
		}
		if (isEven(distance)) {
			if (isEven(time)) return true;
			else return false;
		} else {
			if (isEven(time)) return false;
			else return true;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String inputLine1 = reader.readLine();
			int maxLine = Integer.valueOf(inputLine1);
			Main main = new Main();
			for (int i = 0; i < maxLine; i++) {
				String inputLine2 = reader.readLine();
				String numbers[] = inputLine2.split(" ");
				if (!main.isAvailablePlan(Integer.valueOf(numbers[0]),
						Integer.valueOf(numbers[1]),
						Integer.valueOf(numbers[2]))) {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		} catch (IOException ignore) {
		}
	}
}
