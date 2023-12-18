import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	int fx;

	ArrayList<Long> as;
	long aMin;
	long b;

	public Main() {
		this.fx = 0;
		this.as = new ArrayList<Long>();
		this.aMin = 1000000001;
		this.b = 0;
	}

	public void print()
	{
		long sum = this.b;
		for(long val: as) {
			sum += val - this.aMin;
		}
		System.out.println(this.aMin + " " + sum);
	}

	public void update(long a, long b) {
		this.as.add(a);
		if (this.aMin > a) {
			this.aMin = a;
		}
		this.b += b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.nextLine());
		Main main = new Main();
		for(int i = 0; i<q; i++) {
			String[] tmp = sc.nextLine().split(" ");
			if (tmp[0].equals("2")) {
				main.print();
			} else {
				main.update(Long.parseLong(tmp[1]), Long.parseLong(tmp[2]));
			}
		}
		sc.close();

	}
}
