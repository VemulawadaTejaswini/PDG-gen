import java.util.*;

/* No.10015 */
public class Main {
	static String getMark(int i) {
		return i == 0 ? "S" :
			i == 1 ? "H" :
			i == 2 ? "C" : "D";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] card = new int[(int)'S'+10][20];
		int n = sc.nextInt();
		while ( n-- > 0 ) {
			String m = sc.next();
			int index = m.equals("S") ? 0 :
				m.equals("H") ? 1 :
				m.equals("C") ? 2 : 3;
			card[index][sc.nextInt()]++;
		}
		for ( int i = 0; i < 4; i++ )
			for ( int j = 1; j < 14; j++ )
				if ( card[i][j] == 0 ) System.out.println(getMark(i)+" "+j);
	}
}