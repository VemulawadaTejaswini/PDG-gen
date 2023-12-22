import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		int[] list;
		int length;
		int primes = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		length = keyboard.nextInt();
		
		list = new int[length];
		
		for(int i = 0; i < length; i++) {
			list[i] = keyboard.nextInt();
		}
		
		for(int i = 0; i < length; i++) {
			if(isPrime(list[i])) primes++;
		}
		
		System.out.println(primes);
		
	}
	
	public static boolean isPrime(int a) {
		
	    if(a == 2 || a == 3 || a == 5 || a == 7) {
		    return true;
		    }
	    if(a % 2 == 0) {
		    return false;
		    }
	    for(int j=3;j <= Math.sqrt(a);j++){
	        if(a % j == 0){ 
	            return false;}
	    }
	    return true;
	    }
		
}

