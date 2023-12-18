import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		
		ans = c - (a - b);
		if (ans < 0)
			ans = 0;
		out.println(ans);

	}
}