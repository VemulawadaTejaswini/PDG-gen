import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b  = sc.nextLong();
		long k  = sc.nextLong();
		long takahashi = 0;
		long aoki = 0;
		
		if(a <= k) {
			takahashi = 0;
		}else {
			takahashi = a - k;
		}
		
		if(b <= k - a) {
			aoki = 0;
		}else {
			aoki = b - (k - a);
		}
		
		System.out.println(takahashi + " " + aoki);
		sc.close();
	}
	
}