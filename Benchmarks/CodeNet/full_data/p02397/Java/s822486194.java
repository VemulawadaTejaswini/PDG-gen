import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0, x, y;
		int datax [] = new int[3000];
		int datay [] = new int[3000];
		
		do {
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			
			if(x == 0 && y == 0 || )break;
			
			datax[n] = x;
			datay[n] = y;
			
			n++;
		}while(x < 0 || x > 10000 || y < 0 || y > 10000 );
		
		
		for(int i = 0; i < n ; i++) {
			if(datax[i] > datay[i]) {
				x = datay[i];
				y = datax[i];
			}else {
				x = datax[i];
				y = datay[i];
			}
			
			System.out.println(x + " " + y);
			
		}
	}
}
