import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static class Restaurant {
		private int num;
		private int point;
		private String name;

		public Restaurant(int num, String name, int point) {
			this.num = num;
			this.point = point;
			this.name = name;
		}

		public int getNum() {
			return num;
		}

		public int getPoint() {
			return point;
		}

		public String getName() {
			return name;
		}
	}

	static class Sorter implements Comparator<Restaurant> {
		public int compare(Restaurant c1, Restaurant c2) {
			int ret = 0;
			if(c1.getName().compareTo(c2.getName()) == 0){
				if (c1.getPoint() < c2.getPoint()) {
					ret = 1;
				} else if (c1.getPoint() > c2.getPoint()) {
					ret = -1;
				}
			}else{
				ret = c1.getName().compareTo(c2.getName());
			}

			return ret;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		ArrayList<Restaurant> target = new ArrayList<Restaurant>();

		for (int i = 0; i < N; i++) {
			target.add(new Restaurant(i + 1, sc.next(), sc.nextInt()));
		}

		Collections.sort(target, new Sorter());

		for(Restaurant c : target) {
            System.out.println(c.getNum());
        }
	}
}
