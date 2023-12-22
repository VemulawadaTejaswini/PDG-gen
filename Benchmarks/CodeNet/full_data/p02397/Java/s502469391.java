import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x, y;
		int data [][] = new int[3000][2];
		
		n = 0;
		
		do {
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			
			while(x < 0 || x > 10000 || y < 0 || y > 10000) {
				x = stdIn.nextInt();
				y = stdIn.nextInt();
			}
			data[n][0] = x;
			data[n][1] = y;
			
			n++;
		}while( x != 0 && y != 0);
		
		
		for(int i = 0; i < n - 1; i++) {
			if(data[i][0] > data[i][1]) {
				x = data[i][1];
				y = data[i][0];
			}else {
				x = data[i][0];
				y = data[i][1];
			}
			
			System.out.println(x + " " + y);
			
		}
	}
}
