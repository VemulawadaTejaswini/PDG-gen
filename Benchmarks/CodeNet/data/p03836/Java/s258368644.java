import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int sx = parseInt(sc.next());
		int sy = parseInt(sc.next());
		int tx = parseInt(sc.next());
		int ty = parseInt(sc.next());
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i=sy;i<ty;i++) {
			pw.print('U');
		}
		for(i=sx;i<tx;i++) {
			pw.print('R');
		}
		for(i=sy;i<ty;i++) {
			pw.print('D');
		}
		for(i=sx;i<tx;i++) {
			pw.print('L');
		}
		pw.print('L');
		for(i=sy;i<=ty;i++) {
			pw.print('U');
		}
		for(i=sx;i<=tx;i++) {
			pw.print('R');
		}
		pw.print('D');
		pw.print('R');
		for(i=sy;i<=ty;i++) {
			pw.print('D');
		}
		for(i=sx;i<=tx;i++) {
			pw.print('L');
		}
		pw.println('U');
		pw.flush();
	}
}
