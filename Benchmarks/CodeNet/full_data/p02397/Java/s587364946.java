import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0, x, y;
		int data [][] = new int[3000][2];
		
		do {
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			
			if(x == 0 && y == 0 )break;
			
			data[n][0] = x;
			data[n][1] = y;
			n++;
		}while(x < 0 || x > 10000 || y < 0 || y > 10000 );
		
		
		for(int i = 0; i < n ; i++) {
			if(data[i][0] > data[i][1]) {
				x = datay[i][1];
				y = datax[i][0];
			}else {
				x = data[i][0];
				y = data[i][1];
			}
			
			System.out.println(x + " " + y);
			
		}
	}
}
