import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 1) {
		    System.out.println(1);
		    return;
		}
		long prepre = 1;
		long pre = 1;
		for (int i = 2; i <= n; i++) {
		    long x = prepre + pre;
		    prepre = pre;
		    pre = x;
		}
		System.out.println(pre);
	}
	
}

