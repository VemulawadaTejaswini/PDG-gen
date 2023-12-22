import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;
		int n = 0;
		int data[] = new int[10000];
		
		do {
			x = stdIn.nextInt();
			
			if( x == 0)break;
			
			data[n] = x;
			
			n++;
			
		}while(x >= 1 && x <= 10000);
		
		for(int i = 0; i < n; i++) {
			System.out.println("Case " + (i + 1) + ": " + data[i] );
		}
		
	}
}
