import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			if (i%3==0 || i%10==3) {out.print(" "+i);}
		}
		out.println();
	}
}
