import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		int a = sc.nextInt();
		System.out.println(a + a * a + a * a * a);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}