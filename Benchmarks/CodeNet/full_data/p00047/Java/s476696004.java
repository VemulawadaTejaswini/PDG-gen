import java.util.*;

public class Main {
	String ball = "A";
	public void change ( String a , String b ) {
		if ( ball.equals(a) ) ball = b;
		else if ( ball.equals(b) ) ball = a;
	}
	
	public static void main ( String[] args ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			String s = sc.next();
			String[] cup = s.split(",");
			m.change(cup[0],cup[1]);
		}
		System.out.println(m.ball);
	}
}