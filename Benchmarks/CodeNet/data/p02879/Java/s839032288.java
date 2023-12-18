import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ( a < 1 || b < 1 || a > 9 || b > 9)
			out.println(-1);
		else
			out.print(a * b);
		
	}
}
