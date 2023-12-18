import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] maze = new char[H][W];
		long[][] dp = new long[H][W];
			
		for(int i=0; i<H; i++) {
			String s = sc.next();
			for(int j=0; j<W; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		
		
out.println(0);	
	}
}