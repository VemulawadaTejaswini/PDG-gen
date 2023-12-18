package tesutoyo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static class restVal implements Comparable<restVal> {

		private String name;


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTensu() {
			return tensu;
		}

		public void setTensu(int tensu) {
			this.tensu = tensu;
		}

		private int tensu;

		@Override
		public int compareTo(restVal rV) {

			int result = this.name.compareTo(rV.name);
			if (result == 0) {
				result = -Integer.valueOf(this.tensu).compareTo(Integer.valueOf(rV.tensu));
			}
			return result;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s[] = new String[n];
		int p[] = new int[n];
		
		List<restVal> restVal = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			p[i] = sc.nextInt();
			restVal a = new restVal();
			a.setName(s[i]);
			a.setTensu(p[i]);
			restVal.add(a);

		}
		Collections.sort(restVal);

		int anc[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((restVal.get(i).getName()+restVal.get(i).getTensu()).equals(s[j] + p[j])) {
					anc[i] = j+1;
					break;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(anc[i]);
		}
	}

}
