
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(deepToString(os));
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)
				return;
			int[] is = new int[n+m];
			for(int i = 0; i < n; i++)
				is[i] = sc.nextInt();
			for(int i = 0; i < m; i++)
				is[i+n] = sc.nextInt();
			sort(is);
			for(int i = n + m - 1; i > 0; i--)
				is[i] -= is[i-1];
			int max = 0;
			for(int i = 0; i < n + m; i++)
				max = max(max, is[i]);
			System.out.println(max);
		}
	}
}