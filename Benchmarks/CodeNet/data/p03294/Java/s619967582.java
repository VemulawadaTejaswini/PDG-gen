import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.abs;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int sum = 0;
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
			sum += a[i] -1; 
		}
		sc.close();
		out.println(sum);
	}
}