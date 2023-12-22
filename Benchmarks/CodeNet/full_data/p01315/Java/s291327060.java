import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			ArrayList<Product> products = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");
				int p = Integer.parseInt(str[1]);
				int a = Integer.parseInt(str[2]);
				int b = Integer.parseInt(str[3]);
				int c = Integer.parseInt(str[4]);
				int d = Integer.parseInt(str[5]);
				int e = Integer.parseInt(str[6]);
				int time[] = { a, b, c, d, e };
				int f = Integer.parseInt(str[7]);
				int s = Integer.parseInt(str[8]);
				int m = Integer.parseInt(str[9]);
				products.add(new Product(str[0], p, time, f, s, m));
				products.get(i).setEfficiency();
			}
			Collections.sort(products);
			for (int i = 0; i < n; i++) {
				System.out.println(products.get(i).name);
			}
			System.out.println("#");
		}
	}
}

class Product implements Comparable<Product> {

	String name;
	int p;
	int time[] = new int[5];
	int f;
	int s;
	int m;

	double efficiency;

	public Product(String name, int p, int time[], int f, int s, int m) {
		this.name = name;
		this.p = p;
		this.time = time;
		this.f = f;
		this.s = s;
		this.m = m;
		efficiency = 0.0;
	}

	public void setEfficiency() {
		int money = ((f * s) * m) - p;
		int t = (time[3] + time[4]) * m;
		t += time[0] + time[1] + time[2];
		efficiency = money / (double) t;
	}

	@Override
	public int compareTo(Product pro) {
		if (this.efficiency > pro.efficiency) {
			return -1;
		} else if (this.efficiency < pro.efficiency) {
			return 1;
		} else {
			return this.name.compareTo(pro.name);
		}
	}
}
