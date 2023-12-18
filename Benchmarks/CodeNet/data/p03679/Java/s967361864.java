import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		sc.close();
		long ab = -a + b;
		out.println(ab<0?"delicious":ab<=x?"safe":"dangerous");
	}
}
