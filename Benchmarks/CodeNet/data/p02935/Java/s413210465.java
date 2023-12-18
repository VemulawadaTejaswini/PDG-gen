import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] v = new int[n];
		double total = 0;
	
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			return;
		}
		
		Arrays.sort(v);
		
		total = (v[0] + v[1]) / 2;
		
		if(n == 2) {
			System.out.println(total);
		}

		for(int i = 2; i < n; i++) {
			total = (total + v[i]) / 2;
		}
		
		System.out.println(total);

	}
}
