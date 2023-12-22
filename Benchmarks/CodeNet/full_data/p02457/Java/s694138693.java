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
			
			switch(odr) {
			case 0:
				int x0=Integer.parseInt(in.next());
				S.add(x0);
				out.println(S.size());
				break;
				
			case 1:
				int x1=Integer.parseInt(in.next());
				out.println((S.contains(x1))? 1 : 0);
				break;
				
			case 2:
				int x2=Integer.parseInt(in.next());
				S.remove(x2);
				break;
				
			case 3:
				int l=Integer.parseInt(in.next()),r=Integer.parseInt(in.next());
				for(int j=l;j<=r;j++) {
					if(S.contains(j)) out.println(j);
				}
			}
		}
		out.flush();
	}

}
