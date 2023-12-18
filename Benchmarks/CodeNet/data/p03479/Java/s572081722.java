import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		int count = 1;
		while (y / x >= 2) {
		    x *= 2;
		    count++;
		}
     System.out.println(count);
	}
}
