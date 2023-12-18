import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int y = Integer.valueOf(s.substring(0, 4));
		int m = Integer.valueOf(s.substring(5, 7));
		int d = Integer.valueOf(s.substring(8, 10));

		if ( m >= 5 ){
			System.out.println("TBD");
		}else{
			System.out.println("Heisei");
		}

	}
}