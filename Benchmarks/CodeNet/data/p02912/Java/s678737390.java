import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int productCount = sc.nextInt();
		int numOfDiscountTicket = sc.nextInt();
		
		long[] products = new long[productCount];
		
		for(int i = 0 ; i < products.length ; i++ ) {
			products[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < numOfDiscountTicket ; i++) {
			Arrays.sort(products);
			products[productCount-1] = products[productCount-1] / 2;
			Arrays.stream(products).forEach(p -> System.out.println(p));
		}
		
		long sum = Arrays.stream(products).sum();
		
		System.out.println(sum);
	}
}