import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			boolean[] memo = new boolean[10];
			int weight = sc.nextInt();
			for (int i=9; i>=0; i++) {
				if (weight >= Math.pow(2,i)) {
					weight -= Math.pow(2,i);
					memo[i]  = true;
				}
			}
			for (int i=0; i<10; i++) {
				if (memo[i]) {out.print((i==9?"":" ")+Math.pow(2,i));}
			}
		}
	}
}
