import java.util.Arrays;
import java.util.Scanner;
public class Main {
	private static int gcd(int a, int  b) {
		int  temp = 0;

		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a != 0 || b != 0) {
		while (a % b != 0){
			temp = a;
			a = b;
			b = temp % b;
		}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int min = a[n-1];
		for(int i = 1; i < n ; i++) {
			min = Math.min(min, gcd(a[i],a[0]));
		}
	System.out.println(min);

	}

}
