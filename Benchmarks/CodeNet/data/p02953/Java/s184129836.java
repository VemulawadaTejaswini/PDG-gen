import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		long[] h = new long[n];
		for(i=0;i<n;i++) {
			h[i] = parseLong(sc.next());
		}
		sc.close();
		boolean f = true;
		long max=h[0];
		for(i=1;i<n;i++) {
			if(max>=h[i]+2) {
				f=false;
//				out.println(i);
				break;
			}
			max = Math.max(max,h[i]);
		}
		String ans = f?"Yes":"No";
		out.println(ans);
	}
}
