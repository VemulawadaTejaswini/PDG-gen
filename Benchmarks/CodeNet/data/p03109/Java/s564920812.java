import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] ymd = s.split("/");
		int y = Integer.parseInt(ymd[0]);
		int m = Integer.parseInt(ymd[1]);
		if(y<2019) System.out.println("Heisei");
		else if(y>2019) System.out.println("TBD");
		else if(m<=4) System.out.println("Heisei");
		else System.out.println("TBD");
		sc = null;
	}
}
