import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int[] x = new int[3];
		for(int i = 0; i < 3; i++){
			x[i] = stdIn.nextInt();
		}
		while( x[0] != 0 || x[1] != 0 || x[2] != 0 ){
			for(int i = 0; i < 3; i++){
				int max = i;
				for(int j = i+1; j < 3; j++){
					if( x[j] > x[max] ){
						max = j;
					}
				}
				int temp = x[max];
				x[max] = x[i];
				x[i] = temp;
			}
			double r = Math.hypot(x[1],x[2]);
			System.out.println(r);
			int n = stdIn.nextInt();
			for(int i = 0; i < n; i++){
				int m = stdIn.nextInt();
				if( m*2 <= r ){
					System.out.println("NA");
				} else {
					System.out.println("OK");
				}
			}
			x[0] = stdIn.nextInt();
			x[1] = stdIn.nextInt();
			x[2] = stdIn.nextInt();
		}
	}
}