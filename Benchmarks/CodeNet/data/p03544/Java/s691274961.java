import java.util.*;

public class ABC089A {
	static long memo[] = new long[90];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(lucas(N));
	}

	private static long lucas(int i) {
		if (i == 0) return 2;
		else if (i == 1) return 1;
		else return memo[i] = (memo[i] != 0 ? memo[i] : lucas(i-1) + lucas(i-2));
	}
}