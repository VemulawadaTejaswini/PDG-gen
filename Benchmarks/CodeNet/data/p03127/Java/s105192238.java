import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if (min > x) min = x;
			set.add(x);
		}
		
		int count = 1;
		int po = min;
		int poid = min;
		int sz = set.size();
		for(int i=0;i<sz;i++) {
			count = 0;
			for(int g : set) {
				if (po > g%po && g%po>0) {
					po = g%po;
					poid = g;
					count++;
				}
			}
			if (set.contains(poid)) set.remove(poid);
			if(count ==0) break;
		}
		System.out.println(po);
	}
}