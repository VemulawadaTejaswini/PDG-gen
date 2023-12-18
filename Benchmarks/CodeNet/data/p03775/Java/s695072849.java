import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int min = 10;

		for( long i = 1; i < n; i++) {
		 int dig = 1;
		 long j = n / i;
		 
		 if(i > j)  break;
		 
		 if(n % i == 0) {
			 long jj = j;
			while(jj >= 10) {
				jj = jj /10;
				dig++;
			}
			min = Math.min(dig, min);
		}
	}
		System.out.println(min);

	}
}
