import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
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
		for(i=0;i<n;i++) {
			while((a[i]&1)==0) {
				cnt++;
				a[i] = a[i] >> 1;
			}
		}
		out.println(cnt);
	}
}