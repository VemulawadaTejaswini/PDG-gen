import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x, y, z;
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
				z = data[i][0];
				data[i][0] = data[i][1];
				data[i][1] = z;
			}
			
			System.out.println(data[i][0] + " " + data[i][1]);
			
		}
	}
}
