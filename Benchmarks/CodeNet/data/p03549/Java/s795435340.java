import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static long LMS = 1900;
	public static long SMS = 100;
	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long m = parseLong(sc.next());
		sc.close();
		long t = m*LMS+(n-m)*SMS;
		out.println(t*(long)pow(2,m));
	}
}
