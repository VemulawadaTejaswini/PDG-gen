import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int[] bb = new int[n];
		int m = n % 2;
		int d = n / 2;
		for(i=0;i<n;i++) {
			if((i+m)%2==1) {
				bb[d-(i+1)/2]= a[i];
			} else {
				bb[d+(i+1)/2]= a[i];
			}
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < n; i++) {
			pw.print(bb[i]);
			pw.print(" ");
		}
		pw.flush();
	}
}
