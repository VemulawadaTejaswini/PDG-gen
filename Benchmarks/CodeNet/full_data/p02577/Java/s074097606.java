import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    long N = scanner.nextLong();
		    long sum = 0;
	        while(N > 0){
	            sum += N % 10;
	            N /= 10;
	        }

	        long sho = sum % 9;
	        if(sho == 0) {
	        System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
}
}