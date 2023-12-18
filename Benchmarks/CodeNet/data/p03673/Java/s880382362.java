import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

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
		ArrayDeque<Integer> b = new ArrayDeque<>();
		int mod = n % 2;
		for(i=0;i<n;i++) {
			if((i+mod)%2==1) {
				b.addFirst(a[i]);
			} else {
				b.addLast(a[i]);
			}
		}
		PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < n; i++) {
			pw.print(b.removeFirst());
			pw.print(" ");
		}
		pw.flush();
	}
}
