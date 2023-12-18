import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Drink[] d = new Drink[n];
		for (int i = 0; i < n; i++) {
			d[i] = new Drink(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(d, new Comparator<Drink>() {
			public int compare(Drink d1, Drink d2) {
				if(d1.price == d2.price) {
					return d2.num-d1.num;
				}else {
					return d1.price-d2.price;
				}
			}
		});
		long sum = 0;
		for(Drink d1:d) {
			if(m>d1.num) {
				sum += (long)d1.num*(long)d1.price;
				m -= d1.num;
			}else {
				sum += (long)d1.price*(long)m;
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}
	public static class Drink {
		int price; int num;
		Drink(int a, int b){
			this.price = a;
			this.num = b;
		}
	}
}