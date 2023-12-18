import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count = 0;
		int price = 1;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (x == price) {
		        price++;
		        continue;
		    }
		    int d = (x - 1) / price;
		    count += d;
		}
		System.out.println(count);
	}
}
	
