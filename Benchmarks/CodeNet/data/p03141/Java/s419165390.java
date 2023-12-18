import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dish[] dishes = new Dish[n];
		for (int i = 0; i < n; i++) {
			dishes[i] = new Dish(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(dishes, new Comparator<Dish>() {
		public int compare(Dish d1, Dish d2) {
			int x = (d1.a - d1.b) - (d2.a - d2.b);
			if (x == 0) {
				return d2.a - d1.a;
			} else {
				return x;
			}
		}
		});
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum += (long)(dishes[i].a);
			} else {
				sum -= (long)(dishes[i].b);
			}
		}
		System.out.println(sum);
	}
	
	static class Dish {
		int a;
		int b;
		public Dish(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}
