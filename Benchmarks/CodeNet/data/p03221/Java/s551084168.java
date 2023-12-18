import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<City> al = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			al.add(new City(i, sc.nextInt(), sc.nextInt()));
		}
		al.sort((x, y) -> x.year - y.year);
		int number[] = new int[n];
		for (int i = 0; i < m; i++) {
			al.get(i).number = number[al.get(i).pre - 1] + 1;
			number[al.get(i).pre - 1]++;
		}
		al.sort((x, y) -> x.id - y.id);

		for (int i = 0; i < m; i++) {
			sb.append(String.format("%06d", al.get(i).pre));
			sb.append(String.format("%06d", al.get(i).number) + "\n");
		}
		System.out.print(sb);
	}
}

class City {
	int id;
	int pre;
	int year;
	int number;

	public City(int id, int pre, int year) {
		this.id = id;
		this.pre = pre;
		this.year = year;
	}
}