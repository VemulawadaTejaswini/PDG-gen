
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		sort(a);
		for(long i=1;i<=(long)a[0];i++)if(a[0]%i == 0){
			boolean f = true;
			for(int j=1;j<n;j++) if(a[j]%i != 0) f = false;
			if(f) System.out.println(i);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}