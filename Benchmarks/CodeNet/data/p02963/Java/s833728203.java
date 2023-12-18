import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		int m = 1000000000;
		int a = round(s/m);
		if(a == 0) a = 1;
		int c = (int)(a * m - s);
		System.out.println("0 0 " + a + " 1 " + c + " " + m);

	}
}
