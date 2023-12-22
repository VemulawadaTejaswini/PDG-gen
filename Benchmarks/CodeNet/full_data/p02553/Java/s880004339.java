import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
 
public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long max = -1000000000000000000l;
		long ac = a*c;
		long bc = b*c;
		long cd = b*d;
		long da =d* a;
		System.out.println(Math.max(Math.max(ac, bc), Math.max(cd, da)));
		
	}

}