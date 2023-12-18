
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();

		restaurant[] ary = new restaurant[N];

		for (int i = 0; i < N; i++) {
			ary[i] = new restaurant(i + 1, sc.next(), sc.nextInt());
		}

		Arrays.sort(ary);

		Stream.of(ary).forEach(s -> System.out.println(s.number));

	}
}

class restaurant implements Comparable<restaurant> {
	int number;
	String city;
	int point;

	public restaurant(int numer, String city, int point) {
		super();
		this.number = numer;
		this.city = city;
		this.point = point;
	}

	@Override
	public String toString() {
		return "restaunrant [numer=" + number + ", city=" + city + ", point=" + point + "]";
	}

	@Override
	public int compareTo(restaurant r) {
		int ret = this.city.compareTo(r.city);
		if (ret != 0) {
			return ret;
		}

		return Integer.compare(r.point, this.point);
	}

}