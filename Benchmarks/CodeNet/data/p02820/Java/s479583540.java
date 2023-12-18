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
		int k = parseInt(sc.next());
		long r = parseLong(sc.next());
		long s = parseLong(sc.next());
		long p = parseLong(sc.next());
		char[] t = sc.next().toCharArray();
		sc.close();
		long total=0;
		for (i = 0; i < n; i++) {
			switch(t[i]) {
			case 'r':
				total+=p;
				break;
			case 's':
				total+=r;
				break;
			case 'p':
				total+=s;
				break;
			}
		}
		for (i = k; i < n; i++) {
			if(t[i]==t[i-k]) {
				switch(t[i]) {
				case 'r':
					total-=p;
					break;
				case 's':
					total-=r;
					break;
				case 'p':
					total-=s;
					break;
				}
				t[i]='x';
			}
		}
		out.println(total);
	}
}
