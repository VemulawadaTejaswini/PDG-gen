import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		
		for (int i = 3; i <= n; i++) {
		    
			if (i % 3 == 0 || String.valueOf(i).contains("3"))
				System.out.print(" " + i);
				
		}
		
		System.out.println();
	}
}

