import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];

		for (int i = 0; i < M; i++) {
			P[i] = in.nextInt();
			Y[i] = in.nextInt();
		}

		City[] cities = new City[M];
		for (int i = 0; i < M; i++) {
			cities[i] = new City(P[i], Y[i]);
		}

//		for (int j = 0; j < M; j++) {
//			System.out.println(cities[j].prefecture + " " + cities[j].year);
//		}

		for (int Pi = 1; Pi <= N; Pi++) {
			ArrayList<City> pCities = new ArrayList<>();
			for (int j = 0; j < M; j++) {
				if (Pi == cities[j].prefecture) {
					pCities.add(cities[j]);
				}
			}
			for (int i = 0; i < pCities.size(); i++) {
				pCities.get(i).setNum(i + 1);
			}
			for (int i = 0; i < pCities.size(); i++) {
				System.out.println(pCities.get(i).prefecture + " " + pCities.get(i).year + " " + pCities.get(i).num);
			}
			for (int i = 0; i < pCities.size() - 1; i++) {
				for (int j = i + 1; j < pCities.size(); j++) {
					if (pCities.get(j).year < pCities.get(i).year) {
						int t = pCities.get(j).num;
						pCities.get(j).setNum(pCities.get(i).num);
						pCities.get(i).setNum(t);
					}
				}
			}
		}

		for (int i = 0; i < M; i++) {
			System.out.println(String.format("%06d%06d", cities[i].prefecture, cities[i].num));
		}
	}

}

class City {
	int prefecture;
	int year;
	int num;

	City(int prefecture, int year) {
		this.prefecture = prefecture;
		this.year = year;
		this.num = 0;
	}

	void setNum(int num) {
		this.num = num;
	}
}
