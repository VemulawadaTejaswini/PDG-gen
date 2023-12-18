import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static class City implements Comparable<City> {

		public int getP() {
			return P;
		}

		public void setP(int p) {
			P = p;
		}

		public int getY() {
			return Y;
		}

		public void setY(int y) {
			Y = y;
		}

		public int getSORT() {
			return SORT;
		}

		public void setSORT(int sORT) {
			SORT = sORT;
		}

		public String getCityNumber() {
			return cityNumber;
		}

		public void setCityNumber(String cityNumber) {
			this.cityNumber = cityNumber;
		}

		int P;
		int Y;
		int SORT;
		String cityNumber;

		public City() {
		}

		@Override
		public int compareTo(City o) {
			// TODO Auto-generated method stub
			int i = this.P - o.P;
			if (i == 0) {
				return this.Y - o.Y;
			}
			return i;
		}
	}

	public static void main(String args[]) throws Exception {

		int N;
		int M;
		int P;
		int Y;

		ArrayList<City> citys = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		if (N >= 1 && N <= (int)Math.pow(10,5)) {
			M = sc.nextInt();
			sc.nextLine();
			if (M >= 1 && M <= (int)Math.pow(10,5)) {
				for (int i = 1; i <= M; i++) {
					P = sc.nextInt();
					if (P >= 1 && P <= N) {
						Y = sc.nextInt();
						if (Y >= 1 && Y <= (int)Math.pow(10,9)) {
							City city = new City();
							city.setCityNumber("");
							city.setP(P);
							city.setSORT(i);
							city.setY(Y);
							sc.nextLine();
							citys.add(city);
						}

					}

				}

			}
		}
		Collections.sort(citys);
		int i = 0;
		int currentP = 1;
		for (City city : citys) {
			String cityName = "";
			int tempP1 = city.P;
			if (tempP1 == currentP) {
				i++;
			} else {
				i = 1;
				currentP = tempP1;
			}
			currentP = tempP1;
			String city1 = addZeroForNum(String.valueOf(city.P), 6);
			String city2 = addZeroForNum(String.valueOf(i), 6);
			String cityTemp = city1 + city2;
			city.setCityNumber(cityTemp);
		}
		Collections.sort(citys, new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				return o1.SORT - o2.SORT;
			}
		});
		for (City city : citys) {
			System.out.println(city.getCityNumber());
		}

	}

	public static String addZeroForNum(String str, int strLength) {
		int strLen = str.length();
		StringBuffer sb = null;
		while (strLen < strLength) {
			sb = new StringBuffer();
			sb.append("0").append(str);// 左补0
			// sb.append(str).append("0");//右补0
			str = sb.toString();
			strLen = str.length();
		}
		return str;
	}

}
