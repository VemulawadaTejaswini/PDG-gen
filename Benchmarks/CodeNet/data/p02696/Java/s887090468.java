import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long ans = 0;
		
		for(long x = 1; x <= n; x++) {
			int calc = (int) (Math.floor(a*x/b) - (a * Math.floor(x/b))); 
			if(ans <= calc) {
				ans = calc;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}