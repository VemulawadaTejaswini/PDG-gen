import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0062
public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int[][] is = new int[10][10];
			char[] cs = sc.next().toCharArray();
			for (int i = 0; i < 10; i++) is[0][i] = cs[i] - '0';
			for (int i = 1; i < 10; i++) 
				for (int j = 0; j < 10 - i; j++) 
					is[i][j] = (is[i - 1][j] + is[i - 1][j + 1]) % 10;
			
			System.out.println(is[9][0]);
		}
	}
}