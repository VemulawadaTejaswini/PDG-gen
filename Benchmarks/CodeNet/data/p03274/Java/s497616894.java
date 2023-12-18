import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			if(x<0) l.add(-x);
			else r.add(x);
		}
		l.sort(Comparator.naturalOrder());
		int lsize = l.size();
		int rsize = r.size();
		
		int ans = Integer.MAX_VALUE;
		if(lsize>=k) ans = Math.min(ans, l.get(k-1));
		if(rsize>=k) ans = Math.min(ans, r.get(k-1));
		for(int i=0;i<lsize;i++) {
			if(i+1+rsize<k) continue;
			if(k-i-2<0) break;
			int distance = 2*l.get(i)+r.get(k-i-2);
			if(distance<ans) ans = distance;
		}
		for(int i=0;i<rsize;i++) {
			if(i+1+lsize<k) continue;
			if(k-i-2<0) break;
			int distance = 2*r.get(i)+l.get(k-i-2);
			if(distance<ans) ans = distance;
		}
		System.out.println(ans);
		in.close();
	}

}
