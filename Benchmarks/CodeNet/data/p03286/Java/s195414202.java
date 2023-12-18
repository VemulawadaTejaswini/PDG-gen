import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
		    System.out.println(0);
		    return;
		}
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
		    int mod = n % 2;
		    sb.append(Math.abs(mod));
		    if (flag) {
		        n -= Math.abs(mod);
		    } else {
		        n += Math.abs(mod);
		    }
		    n /= 2;
		    flag ^= true;
		}
		System.out.println(sb.reverse());
	}
}
