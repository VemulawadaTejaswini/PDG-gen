import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		long sum = 0;
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
			sum += a[i]; 
		}
		sc.close();
		long asum;
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<n;i++) {
			asum = 0;
			for(j=i+1;j<i+n;j+=2) {
				asum += a[j%n];
			}
			pw.print(sum-2*asum);
			pw.print(" ");
		}
		pw.flush();
	}
}
