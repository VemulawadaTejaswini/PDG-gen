import java.util.*;

class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	int cnt = 0;
	for ( int i = 0; i < S.length(); i++ ) {
	    if ( S.charAt(i) == '2' ) cnt++;
	}
	System.out.println(cnt);
    }
}
