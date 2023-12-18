import java.util.*;
//import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		sc.close();
		long ans = n*(n-1)/2;
		out.println(ans);
	}
}
