import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();

		int [] p = new int[n];
		
		long sum = 0;
		
		for(int i = 0; i < n ; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		for(int i = 0; i < k ;i++) {
			sum += p[i];
		}
		
		System.out.println(sum);
		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
