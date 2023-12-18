import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long M = sc.nextInt();
		
		List<Shop> shops = new ArrayList<Shop>();
		
		for(int i = 0; i < N; i++) {
			shops.add(new Shop(sc.nextLong(), sc.nextLong()));
		}
		
		Comparator<Shop> comp = new Comparator<Shop>() {
			@Override
			public int compare(Shop o1, Shop o2) {
				if(o1.money == o2.money) return 0;
				return o1.money < o2.money ? -1 : 1;
			}
		};
		
		Collections.sort(shops, comp);
		
		long res = 0;
		
		loop: for(Shop shop : shops) {
			for(int i = 0; i < shop.stock; i++) {
				if(M  > 0) {
					res+=shop.money;
					M-=1;
				}else{
					break loop;
				}
			}
		}
		
		System.out.println(res);
		
	}
}

class Shop{
	public long money;
	public long stock;
	
	public Shop(long money, long stock) {
		this.money = money;
		this.stock = stock;
	}
}