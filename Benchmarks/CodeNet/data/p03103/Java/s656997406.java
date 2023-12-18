import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		SortedShops ss = new SortedShops(a, b);
		System.out.println(ss.getTotalPrice(m));
	}
	
}

class SortedShops {
	Shop[] shops;
	public SortedShops(int[] a, int[] b) {
		int n = a.length;
		shops = new Shop[n];
		for (int i = 0; i < n; i++) {
			shops[i] = new Shop(a[i], b[i]);
		}
		Arrays.sort(shops, (p, q) -> p.price - q.price);
		for (Shop s : shops) {
			//			System.out.println(s.price + " " + s.number);
		}
	}
	long getTotalPrice(int m) {
		long totalPrice = 0;
		int num = m;
		for (Shop s : shops) {
			int buy = Math.min(num, s.number);
			num -= buy;
			totalPrice += (long)buy * s.price;
			//			System.out.println(buy + " " + totalPrice);
			if (num == 0) {
				break;
			}
		}
		return totalPrice;
	}
}

class Shop {
	int price;
	int number;
	public Shop(int a, int b) {
		price = a;
		number = b;
	}
}
