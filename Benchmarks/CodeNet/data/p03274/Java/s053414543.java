import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		long[] x = new long[n];
		ArrayList<Long> p = new ArrayList<>();  
		ArrayList<Long> m = new ArrayList<>(); 
		p.add(0L);
		m.add(0L);
		for(i=0;i<n;i++) {
			x[i] = parseLong(sc.next());
			if(x[i]==0) k--;
			if(x[i]<0) {
				m.add(-x[i]);
			} else {
				p.add(x[i]);
			}
		}
		sc.close();
		Collections.sort(m);
//		out.println(m.toString());
//		out.println(p.toString());
		long mn = 300000000;
		long tmp = 0;
		for(i = 0; i <= k; i++) {
//			out.printf("%d:%d%n",p.size(),i+1);
			if(p.size() < i+1) continue;
//			out.printf("%d:%d%n",m.size(), k-i+1);
			if(m.size() < k-i+1) continue;
			tmp = p.get(i) + m.get(k-i) + Math.min(p.get(i), m.get(k-i));
//			out.printf("%d:%d%n",i,tmp);
			if(tmp < mn) mn = tmp;
		}
		out.println(mn);
	}
}
