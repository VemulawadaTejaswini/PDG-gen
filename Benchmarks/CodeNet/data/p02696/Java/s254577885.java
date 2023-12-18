import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long num = Math.min(b-1, n);
		
		long ans = (long) (Math.floor(a*num/b) - (a * Math.floor(num/b))); 
		
		System.out.println(ans);
		sc.close();
	}

}