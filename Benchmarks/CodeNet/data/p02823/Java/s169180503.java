import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a%2==b%2) {
			long c = (b-a)/2;
			System.out.println(c);
		}
		else {
			
			long ans1 = a+(b-a-1)/2;
			long ans2 = n-b+1+(b-a-1)/2;
			System.out.println(Math.min(ans1,ans2));
		
			
		}
	}
}
