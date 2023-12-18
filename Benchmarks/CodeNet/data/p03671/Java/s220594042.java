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
		int[] a = new int[N];
		for (i = 0; i <N; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		out.println(a[0]+a[1]);
	}
}
