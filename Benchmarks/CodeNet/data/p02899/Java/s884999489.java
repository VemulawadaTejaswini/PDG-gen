import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			int[][] a = new int[N][2]; 
					
			for(int i=0; i<N; i++) {
				int h = scan.nextInt();
				a[i][0] = i+1;
				a[i][1] = h;
			}
			
			Arrays.sort(a, (x, y) -> Integer.compare(x[1], y[1]));
			
			for(int i=0; i<N; i++) {
				System.out.print(a[i][0]+" ");
			}
			
			return;
			
		}
	}
}