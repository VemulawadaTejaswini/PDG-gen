
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        PrintWriter out=new PrintWriter(System.out);
        TreeSet<Integer> set=new TreeSet<>();
        int q=Integer.parseInt(in.next());
        for(int i=0;i<q;i++) {
            int odr=Integer.parseInt(in.next());

            switch(odr) {
            case 0:
            	int x0=Integer.parseInt(in.next());
            	if(!set.contains(x0)) set.add(x0);
            	out.println(set.size());
            	break;

            case 1:
            	int x1=Integer.parseInt(in.next());
            	out.println(set.contains(x1)? 1:0);
            	break;
            	
            case 2:
            	int x2=Integer.parseInt(in.next());
            	set.remove(x2);
            	break;
            	
            case 3:
            	int L=Integer.parseInt(in.next()),R=Integer.parseInt(in.next());
            	NavigableSet<Integer> sub=set.subSet(L, true, R, true);
            	Iterator<Integer> itr=sub.iterator();
            	
            	while(itr.hasNext()) {
            		int key=itr.next();
            		out.println(key);
            	}
            }

        }
        out.flush();
    }

}
