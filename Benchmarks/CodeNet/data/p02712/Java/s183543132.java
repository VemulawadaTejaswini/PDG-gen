import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int total = 0;

		for(int i = 1; i <= n; i++) {


			if(i % 3 == 0 && i % 5 == 0) {
				
				//System.out.println("FizzBuzz");
				
			}else if(i % 3 == 0) {
				
				//System.out.println("Fizz");
				
			}else if(i % 5 == 0) {
				
				//System.out.println("Buzz");
			
			}else {
			
				total += i;
				//System.out.println(i);
			
			}


		}

		System.out.println(total);
	}
}
