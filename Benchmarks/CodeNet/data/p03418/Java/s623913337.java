import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long k = scan.nextInt();
		long count = 0;
		
		for(int i = 1; i <= n; i++) { 
			for(int j = 1; j <= n; j++) {
				if(i % j >= k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}