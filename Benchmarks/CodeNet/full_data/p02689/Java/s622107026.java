import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();

		Hill hill = new Hill();
		IntStream.range(0, n).forEach(i -> hill.addTenboudai(stdIn.nextInt()));
		IntStream.range(0, m).forEach(i -> hill.addPath(stdIn.nextInt(), stdIn.nextInt()));

		System.out.println(hill.getGoodTenb());


		stdIn.close();
	}
}

class Hill {
	private List<Tenboudai> tenbList = new ArrayList<Tenboudai>();


	public void addPath(int fromIndex, int toIndex) {
		tenbList.get(fromIndex-1).addPath(toIndex);
		tenbList.get(toIndex-1).addPath(fromIndex);
	}

	public void addTenboudai(int height) {
		tenbList.add(new Tenboudai(height));
	}

	public Tenboudai getTenboudai(int index) {
		return tenbList.get(index);
	}

	public int getGoodTenb() {

		int cnt = 0;

		for (Tenboudai tenboudai : tenbList) {

			if(tenboudai.isEmptyPath()) {
				cnt++;
				continue;
			}

			int currentHeight = tenboudai.getHeight();
//			tenboudai.getPaths().stream().map(p -> tenbList.get(p-1).getHeight());
			boolean isGood = tenboudai.getPaths().stream().allMatch(p -> tenbList.get(p-1).getHeight() < currentHeight);

			if(isGood) {
				cnt++;
			}

		}

		return cnt;
	}

}

class Tenboudai {
	private int height;
	private Set<Integer> paths = new HashSet<Integer>();

	public Tenboudai(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public Set<Integer> getPaths() {
		return paths;
	}

	public boolean isEmptyPath() {
		return paths.isEmpty();
	}

	public void addPath(int index) {
		paths.add(index);
	}
}