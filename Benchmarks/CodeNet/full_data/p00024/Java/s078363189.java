import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int i = 0;
			double in,t,y;
			in = sc.nextDouble();
			t = in / 9.8;
			y = 4.9 * (t*t);
			while ( 5*i-5<y ) i++;
			System.out.println(i);
		}
	}
}