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
		long[] a = new long[n];
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		long cnt=0;
		int sign0 = signum(a[0]);
		long sum = a[0];
		for (i = 1; i < a.length; i++) {
			sum += a[i];
			int sign1 = signum(sum);
			if(sign1 == 0 ||sign0 == sign1) {
				long dif = (long)(-sign0) - sum;
				sum += dif;
				cnt += abs(dif);
				sign1 = -sign1;
			}
			sign0 = sign1;
		}
		if(sum==0)cnt++;
		out.println(cnt);
	}
}
