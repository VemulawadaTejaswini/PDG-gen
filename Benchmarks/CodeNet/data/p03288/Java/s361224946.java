import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int j;
		Scanner sc = new Scanner(in);
		int r = parseInt(sc.next());
		sc.close();
		out.println(r<1200?"ABC":(r<2800?"ARC":"AGC"));
	}
}
