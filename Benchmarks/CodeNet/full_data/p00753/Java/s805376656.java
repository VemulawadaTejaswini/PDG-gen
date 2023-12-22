import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int count = 0, nn = n * 2;
			for(int i = n + 1; i <= nn; i++) {
				if(isPrime(i)) count++;
			}
			System.out.println(count);
		}
		
	}
	
	public static boolean isPrime(int number) {
	    return number > 2
	      && IntStream.rangeClosed(2, (int) Math.sqrt(number))
	      .noneMatch(n -> (number % n == 0));
	}

}

