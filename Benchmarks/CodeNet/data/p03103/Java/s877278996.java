
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer , Integer> shopMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			Long shop = sc.nextLong();
			Long value = sc.nextLong();
			shopMap.put(Integer.valueOf(shop.toString()), Integer.valueOf(value.toString()));
		}
		long los = 0;
		for (Integer price: shopMap.keySet()) {
			int items = shopMap.get(price);
			for (;items > 0  && M > 0; --M , --items) {
				los += price;
			}
			if (M == 0) {
				break;
			}
		}
		System.out.println(los);
	}

}
