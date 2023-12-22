
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		Set<Integer> S=new HashSet<>();
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int odr=Integer.parseInt(in.next());
			if(odr==0) {
				int x=Integer.parseInt(in.next());
				S.add(x);
				out.println(S.size());
			}
			else {
				int x=Integer.parseInt(in.next());
				out.println((S.contains(x))? 1 : 0);
			}
		}
		out.flush();
	}

}

