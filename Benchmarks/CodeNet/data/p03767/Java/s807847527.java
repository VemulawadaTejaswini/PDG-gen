import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[3*n];
		for (i = 0; i < a.length; i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		long sum=0;
		for (i = n; i < 3*n; i+=2) {
			sum+=a[i];
		}
		out.println(sum);
	}
}
