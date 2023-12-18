import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextInt();
		PriorityQueue<Shop> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(new Shop(sc.nextInt(), sc.nextInt()));
		}
		long total = 0;
		while (queue.size() > 0 && m > 0) {
		    Shop s = queue.poll();
		    total += s.price * Math.min(m, s.count);
		    m -= s.count;
		}
		System.out.println(total);
   }
   
   static class Shop implements Comparable<Shop> {
       int price;
       int count;
       
       public Shop (int price, int count) {
           this.price = price;
           this.count = count;
       }
       
       public int compareTo(Shop another) {
           return price - another.price;
       }
   }
}
