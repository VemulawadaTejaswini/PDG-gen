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
		HashSet<Integer> c = new HashSet<>();
		for (i = 0; i < N; i++) {
			c.add(parseInt(sc.next()));
		}
		sc.close();
		out.println(c.size());
	}
}
