import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private int currentPositionX;
	private int currentPositionY;
	private int currentSecond;

	private class TravelPosition {
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof TravelPosition)) {
				return false;
			}
			TravelPosition other = (TravelPosition) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		final int x;
		final int y;

		TravelPosition(int x, int y) {
			this.x = x;
			this.y = y;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}

	public List<TravelPosition> createNextTravelPosition(int positionX,
			int positionY) {
		List<TravelPosition> postionList = new ArrayList<TravelPosition>();
		postionList.add(new TravelPosition(positionX + 1, positionY));
		if (positionX != 0) {
			postionList.add(new TravelPosition(positionX - 1, positionY));
		}
		postionList.add(new TravelPosition(positionX, positionY + 1));
		if (positionY != 0) {
			postionList.add(new TravelPosition(positionX, positionY - 1));
		}
		return postionList;
	}

	public boolean isAvailablePlan(int second, int positionX, int positionY) {
		int x = currentPositionX;
		int y = currentPositionY;
		List<TravelPosition> currentPostionList = createNextTravelPosition(x, y);
		for (; currentSecond < second; currentSecond++) {
			List<TravelPosition> postionList = new ArrayList<TravelPosition>();
			for (TravelPosition postion : currentPostionList) {
				for (TravelPosition postion2 : createNextTravelPosition(
						postion.x, postion.y)) {
					if (!postionList.contains(postion2)) {
						if ((positionX - postion2.x < second - currentSecond) &&
								(positionY - postion2.y <positionX - postion2.x))
						postionList.add(postion2);
					}
				}
			}
			currentPostionList = postionList;
		}
		for (TravelPosition position : currentPostionList) {
			for (TravelPosition position2 : createNextTravelPosition(
					position.x, position.y)) {
				if (position2.x == positionX && position2.y == positionY) {
					currentPositionX = positionX;
					currentPositionY = positionY;
					currentSecond = second;
					return true;
				}
			}
		}
		return false;
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
