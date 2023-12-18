import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a1 = parseInt(sc.next());
		int a2 = parseInt(sc.next());
		int a3 = parseInt(sc.next());
		sc.close();
		out.println(a1+a2+a3>=22?"bust":"win");
	}
}
