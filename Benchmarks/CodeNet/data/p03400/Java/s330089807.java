import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int d = parseInt(sc.next());
		int x = parseInt(sc.next());
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		d--;
		int sum=n+x;
		for (i = 0; i < n; i++) {
			sum += d/a[i];
		}
		out.println(sum);
	}
}
