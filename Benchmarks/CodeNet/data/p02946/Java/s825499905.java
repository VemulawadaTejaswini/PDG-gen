import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int k = parseInt(sc.next());
		int x = parseInt(sc.next());
		sc.close();
		int s = Math.max(x-k+1, -1000000);
		int e = Math.min(x+k-1, 1000000);
		for (i = s; i <= e; i++) {
			out.print(i);
			out.print(" ");
		}
	}
}
