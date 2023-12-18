import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] numberA = new int[m];
		int[] numberB = new int[m];
		List<City> cities = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			City city = new City(i, sc.nextInt(), sc.nextInt());
			cities.add(city);
		}
		Collections.sort(cities);
		
		int currentKen = -1;
		int cnt = 1;
		for(int i = 0; i < cities.size(); i++) {
			City city = cities.get(i);
			numberA[city.num] = city.ken;
			if (city.ken != currentKen) {
				currentKen = city.ken;
				cnt = 1;
			} else {
				cnt++;
			}
			numberB[city.num] = cnt;
		}
		for(int i = 0; i < m; i++) {
			int ketaA = keta(numberA[i]);
			for(int j = 6; j > ketaA; j--) {
				out.print("0");
			}
			out.print(numberB[i]);
			int ketaB = keta(numberB[i]);
			for(int j = 6; j > ketaB; j--) {
				out.print("0");
			}
			out.println(numberB[i]);			
			
		}
		
	}
	
	
	static class City implements Comparable<City>{
		int num;
		Integer ken;
		Integer year;
		
		City(int num, int ken, int year){
			this.num = num;
			this.ken = ken;
			this.year = year;
		}

		@Override
		public int compareTo(City o) {
			
			int res = this.ken.compareTo(o.ken);
			if (res != 0)
				return res;
			else {
				return this.year.compareTo(o.year);
			}
		}
	}
	
	//自然数の桁数を返す
	static int keta(int n) {
		int cnt = 0;
		while(n > 0) {
			n /= 10;
			cnt++;
		}
		return cnt;
	}
}
