import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Store[] arr = new Store[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Store(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr, new Comparator<Store>() {
		public int compare(Store s1, Store s2) {
			return s1.a - s2.a;
		}
		});
		long total = 0;
		for (int i = 0; i < n && m > 0; i++) {
			int amount = Math.min(arr[i].b, m);
			total += (long)amount * arr[i].a;
			m -= amount;
		}
		System.out.println(total);
	}
	
	static class Store {
		int a;
		int b;
		public Store(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}
