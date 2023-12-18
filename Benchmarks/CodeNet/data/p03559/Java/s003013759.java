import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
		}
		long[] b = new long[n];
		for(i=0;i<n;i++) {
			b[i] = parseLong(sc.next());
		}
		long[] c = new long[n];
		for(i=0;i<n;i++) {
			c[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);
//		out.println(Arrays.toString(a));
//		out.println(Arrays.toString(b));
//		out.println(Arrays.toString(c));
		long sum=0;
		long[] bc = new long[n];
		k=0;
		for(j = 0; j < n; j++) {
			while(k<n&&c[k]<=b[j])k++;
			if(k==n)break;
			bc[j]=n-k;
		}
//		out.println(Arrays.toString(bc));
		long tmp=0;
		j=n-1;
		for(i = n-1; i >= 0; i--) {
			while(j>=0&&a[i]<b[j]) {
				tmp += bc[j];
				j--;
			}
//			out.printf("%d:%d%n", i,tmp);
			if(j==n-1)continue;
//			if(j<0)break;
			sum += tmp;
		}
		out.println(sum);
	}
}