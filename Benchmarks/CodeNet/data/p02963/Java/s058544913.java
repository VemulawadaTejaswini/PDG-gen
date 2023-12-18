import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		int a = round(s/Integer.MAX_VALUE) + 1;
		int c = (int)(a * Integer.MAX_VALUE - s);
		System.out.println("0 0 " + a + " 1 " + c + " " + Integer.MAX_VALUE);

	}
}