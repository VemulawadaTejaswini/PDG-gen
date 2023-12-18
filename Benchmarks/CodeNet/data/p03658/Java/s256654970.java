import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int AB = 26;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		int[] l = new int[n];
		for(i=0;i<n;i++) {
			l[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(l);
		int sum=0;
		for (i = n-1; i >= n-k; i--) {
			sum+=l[i];
		}
		out.println(sum);
	}
}
