import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Long num[] = new Long[n];
		List<Long> product = new ArrayList<Long>();
		
		for(int i = 0; i < n; i++) {
			num[i] = scan.nextLong();
		}
		
		for(int i = 0; i < n-1;i++) {
			for(int j = i + 1; j < n; j++) {
				product.add(num[i]*num[j]);
			}
		}
		
		Collections.sort(product);
		System.out.println(product.get(k-1));
	}
}