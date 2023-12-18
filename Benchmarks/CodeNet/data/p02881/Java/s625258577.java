
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long maxDevider = 1;
		for(long i = 1; i * i <= n; i++){
			if(n % i == 0){
				maxDevider = i;
			}
		}
		System.out.println(maxDevider + n / maxDevider - 2);
	}
}
