//Problem D
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [][] ways = new long[2][1000001];
		int height = sc.nextInt();
		int width = sc.nextInt();
		int low_l = sc.nextInt();
		int left_l = sc.nextInt();
		
		ways[0][1] = 1;
		
		for(int r = 1; r <= height; r++) {
			int c;
			if (r > height - low_l) {
				c = left_l + 1;
				ways[1][left_l] = 0;
 			} else {
 				c = 1; 
 			}
			int ll = c;
			for(;c <= width; c++) {

				ways[1][c] = ways[0][c] + ways[1][c - 1]; 
			
				while (ways[1][c] > 1000000007) {
					ways[1][c] -= 1000000007;
				}
			}
			for(int i = ll; i <= width; i++) {
				ways[0][i] = ways[1][i];
			}
		}
		System.out.println(ways[1][width]);
	}
}
