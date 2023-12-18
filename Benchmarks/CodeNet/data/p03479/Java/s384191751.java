import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
	}
	
	public static void C(Scanner sc) {
		long x = sc.nextLong();
		long y = sc.nextLong();
		long k = (long) ((Math.log(y)-Math.log(x))/Math.log(2));
		k = Math.min(k+1,64);
		while(Math.pow(2, k) > y/(double)x) k--;
		out.print(k+1);
	}
}
