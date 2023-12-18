import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		PrintWriter pw = new PrintWriter(out);
		for(i=0;i<s.length;i+=2) {
			pw.print(s[i]);
		}
		pw.flush();
	}
}
