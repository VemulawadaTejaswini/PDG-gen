import java.util.HashMap;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		HashMap<Long, Long> towns = new HashMap<Long, Long>();
		
		for(long i=1;i<=n;i++) {
			towns.put(i, sc.nextLong());
		}
		long rem = k%n;
		System.out.println(towns.get(towns.get(rem)));
	}
}