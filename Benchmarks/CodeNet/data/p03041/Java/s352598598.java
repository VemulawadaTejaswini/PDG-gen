import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] T = S.split("");
		
		if (T[K-1].equals("A")) {
			T[K-1] = "a";
		}
		if (T[K-1].equals("B")) {
			T[K-1] = "b";
		}
		if (T[K-1].equals("C")) {
			T[K-1] = "c";
		}

		for(int j = 0; j < N; j++) {		
			System.out.print(T[j]);
		}
			
		keyboard.close();	
	}
}