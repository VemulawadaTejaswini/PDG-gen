import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int[] a = new int[n];
		int sum = 0;
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			sum += a[i];
		}
		sc.close();
		int sum4 = (int) ceil((double)sum / (4*m));
		int cnt=0;
		for (i = 0; i < n; i++) {
			if(a[i]>= sum4)cnt++;
		}
		out.println(cnt>=m?"Yes":"No");
	}
}
