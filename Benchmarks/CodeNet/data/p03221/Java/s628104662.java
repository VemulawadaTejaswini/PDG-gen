import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class City {
	private int fP;
	private int fY;
	private int fId;
	private DecimalFormat fDformat;

	public City(int p, int y, DecimalFormat dformat) {
		fP = p;
		fY = y;
		fDformat = dformat;
	}

	public int getY() {
		return fY;
	}

	public String getTextP() {
		return fDformat.format(fP);
	}

	public int getP() {
		return fP;
	}

	public int getId() {
		return fId;
	}

	public String getTextId() {
		return fDformat.format(fId);
	}

	public void setId(int id) {
		fId = id;
	}
}

class compCity implements Comparator<City> {
	public int compare(City city1, City city2) {
		if (city1.getP() < city2.getP() || (city1.getP() == city2.getP() && city1.getY() < city2.getY())) {
			return -1;
		} else if (city1.getP() > city2.getP() || (city1.getP() == city2.getP() && city1.getY() > city2.getY())) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();// N
		int M = sc.nextInt();
		ArrayList<City> cityList = new ArrayList<City>(M);
		ArrayList<City> cityOriginalList = new ArrayList<City>(M);
		DecimalFormat dformat = new DecimalFormat("000000");
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			City c = new City(p, y, dformat);
			cityList.add(c);
			cityOriginalList.add(c);
		}
		sc.close();

		Collections.sort(cityList, new compCity());

		int id = 1;
		int nowP = cityList.get(0).getP();
		for (int i = 0; i < M; i++) {
			if (nowP == cityList.get(i).getP()) {
				cityList.get(i).setId(id);
				id++;
			} else {
				nowP = cityList.get(i).getP();
				id = 1;
				cityList.get(i).setId(id);
				id++;
			}
		}

		for (int i = 0; i < M; i++) {
			System.out.println(cityOriginalList.get(i).getTextP() + cityOriginalList.get(i).getTextId());
		}

	}
}