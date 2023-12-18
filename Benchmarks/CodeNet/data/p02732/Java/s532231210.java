import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n+1];
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			b[a[i]]++;
		}
		sc.close();
		int[] c = new int[n+1];
		for (i = 0; i < n; i++) {
			c[i] = b[i]*(b[i]-1)/2;
		}
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < n; i++) {
			long sum=0;
			for (j = 1; j <= n; j++) {
				if(a[i]==j) {
					sum+=(b[j]-1)*(b[j]-2)/2;
				} else {
					sum+=c[j];
				}
			}
			pw.println(sum);
		}
		pw.flush();
	}
}
