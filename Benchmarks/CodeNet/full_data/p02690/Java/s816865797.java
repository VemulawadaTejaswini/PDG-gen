import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(in);
		long x = parseLong(sc.next());
		sc.close();
		long p=0;
		if(x==1) {
			p=1;
		} else {
			if(x%2==0) {
				p=2;
			} else {
				for (i = 3; i*i <= x; i+=2) {
					if(x%i==0) {
						p=i;
						break;
					}
				}
				if(p==0) {
					p=x;
				}
			}
		}
		int ans=0;
		long b = 0;
		for (i = p; i >= 0; i--) {
			b = i - p;
			if(i*i*i*i*i-b*b*b*b*b==x) break;
		}
		out.printf("%d %d%n", i, b);
	}
}
