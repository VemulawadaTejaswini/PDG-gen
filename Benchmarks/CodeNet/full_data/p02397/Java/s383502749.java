import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0, x, y;
		int datax [] = new int[3000];
		int datay [] = new int[3000];
		
		do {
			datax[n] = stdIn.nextInt();
			datay[n] = stdIn.nextInt();
			
			if(datax[n] == 0 && datay[n] == 0 )break;
			
			n++;
		}while(datax[n] < 0 || datax[n] > 10000 || datay[n] < 0 || datay[n] > 10000 );
		
		
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
