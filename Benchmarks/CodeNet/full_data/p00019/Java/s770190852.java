import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextInt();

		System.out.println(factorial(num));
	}
	
	public static long factorial(long n) {
		long fact = 1;
		if(n == 0)
			return fact;
		else{
			for(long i = n; i > 0; i--)
				fact = fact * i;
			return fact;
		}
	}
}