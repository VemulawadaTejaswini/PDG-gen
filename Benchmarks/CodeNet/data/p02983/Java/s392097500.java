import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long L  = keyboard.nextLong();
		long R  = keyboard.nextLong();
		long x = 2019;
		
		for(int i = 0; i <R-L; i++) {
			Long amari = (L+i) % 2019;
			x = (amari<=x)? amari:x ;
		}
		System.out.print(x*(x+1)%2019);
		
		keyboard.close();	
	}
}
