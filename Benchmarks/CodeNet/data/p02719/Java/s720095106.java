import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long sa;
		n /= k;
		
		
		while (true) {
			if(n%k == 0) {
				n = 0;
				break;
			}
			if(n > k) {
				sa = n - k;
			}else {
				sa = k - n;
			}
			if(n > sa) {
				n = sa;
			}else {
				break;
			}
			
		}
		System.out.println(n);
	}
	
}
