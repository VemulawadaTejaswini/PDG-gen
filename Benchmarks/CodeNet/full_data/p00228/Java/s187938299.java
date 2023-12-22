import java.util.*;

public class Main {
	String now = "0000000";
	String[] ptn = {
			"0111111" , "0000110" , "1011011" , "1001111" , "1100110",
			"1101101" , "1111101" , "0100111" , "1111111" , "1101111"
		};
	public String makeDisplay( String n , int to ) {
		String result = "";
		for ( int i = 0; i < 7; i++ ) {
			if ( n.charAt(i) == ptn[to].charAt(i) ) result += "0";
			else result += "1";
		}
		return result;
	}
	public static void main ( String[] args ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("-1") ) {
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				int num = sc.nextInt();
				m.now = m.makeDisplay(m.now, num);
				System.out.println(m.now);
			}
		}
	}
}