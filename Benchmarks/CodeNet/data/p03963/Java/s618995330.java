import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long k = parseLong(sc.next());
		sc.close();
		long ans = (long) (k * pow(k-1,n-1));
		out.println(ans);
	}
}
