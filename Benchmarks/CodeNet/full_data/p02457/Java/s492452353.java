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
			else if(odr==1){
				int x=Integer.parseInt(in.next());
				out.println((S.contains(x))? 1 : 0);
			}
			else if(odr==2){
				int x=Integer.parseInt(in.next());
				S.remove(x);
			}
			else if(odr==3) {
				int L=Integer.parseInt(in.next()),R=Integer.parseInt(in.next());
				Iterator<Integer> it=S.iterator();
				while(it.hasNext()) {
					int num=it.next();
					if(num>=L && num<=R)out.println(num);
				}
			}
		}
		out.flush();
	}

}

