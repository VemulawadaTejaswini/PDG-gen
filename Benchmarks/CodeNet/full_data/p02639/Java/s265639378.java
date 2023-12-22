import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int N = 5;
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int[] x = new int[N];
		int ans=0;
		for (i = 0; i < N; i++) {
			x[i] = parseInt(sc.next());
			if(x[i]==0) ans=i+1;
		}
		sc.close();
		out.println(ans);
	}
}
