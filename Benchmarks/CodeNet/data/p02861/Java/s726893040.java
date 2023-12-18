import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC145_C {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		List<Town> townList = new ArrayList<Town>();
		IntStream.range(0, n).forEach(i -> townList.add(new Town(stdIn.nextInt(), stdIn.nextInt())));

		Field field = new Field(townList);
		System.out.println(field.average());

		stdIn.close();
	}
}

class Field {
	private List<Town> townList;
	private List<Path> allPaths;

	public Field(List<Town> townList) {
		this.townList = townList;
		this.allPaths = new ArrayList<>();
		permutation(new Path());
	}

	public double average() {
		double sum = 0;

		for (Path path : allPaths) {
			for (int i = 0; i < path.size(); i++) {
				Town current = townList.get(path.getCurrent(i)-1);
				Town next = townList.get(path.getNext(i)-1);

				sum += Town.getDistance(current, next);
			}
		}

		return sum / allPaths.size();
	}

	private void permutation(Path target) {

		int size = target.size();

		if (size == townList.size()) {
			allPaths.add(target);
			return;
		}

		for (int i = 0; i <= size; i++) {
			Path nextpath = (Path) target.clone();
			nextpath.add(i, size + 1);
			permutation(nextpath);

		}
	}

	public List<Town> getTownList() {
		return townList;
	}

	public List<Path> getAllPaths() {
		return allPaths;
	}

}

class Path extends ArrayList<Integer> {

	public int getCurrent(int index) {
		return get(index);
	}

	public int getNext(int index) {

		if (index == this.size() - 1) {
			return get(index);
		}

		return get(index + 1);
	}

}

class Town {
	private int x;
	private int y;

	public Town(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static double getDistance(Town former, Town latter) {
		return Math.sqrt((former.x - latter.x) * (former.x - latter.x) + (former.y - latter.y) * (former.y - latter.y));
	}

	@Override
	public String toString() {
		return "Town [x=" + x + ", y=" + y + "]";
	}

}
