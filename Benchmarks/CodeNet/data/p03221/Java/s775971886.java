import java.util.*;

class City implements Comparable<City>{
	final int prefecture;
	private final int year;

	City(int prefecture, int year){
		this.prefecture = prefecture;
		this.year = year;
	}

	String toString(int number){
		return String.format("%06d%06d", prefecture, number);
	}

	@Override
	public int compareTo(City o) {
		return Comparator.<City>comparingInt(t -> t.year).compare(this, o);
	}
}

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<City> cities = new PriorityQueue<>(N);
		for (int i = 0; i < M; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			cities.add(new City(P, Y));
		}

		int[] prefecturesCounter = new int[N];
		StringJoiner joiner = new StringJoiner("\n");
		while (!cities.isEmpty()){
			City city = cities.remove();
			joiner.add(city.toString(prefecturesCounter[city.prefecture - 1]++ + 1));
		}
		System.out.println(joiner.toString());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}