import java.util.*;

public class Main {

	// test 4  D
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// num of points
		int x = sc.nextInt();		// point X
		int y = sc.nextInt();		// point Y
		
		int ary[] = new int[n+1];

		for (int i=1; i<=n; i++) {
			ary[i] = i;
		}
		
		// distance 1 からの loop
		int dist;
		
		for(dist=1; dist < n; dist++) {
			int count = 0;
			int from, to;
			
			int skipDist = y-x-1;
			int skipTo;
			
			// from node 1 から X までのloop
			for (from=1; from<n; from++) {

				// 直接 or skip を見つける
				// 直接
				to = from+dist;
				skipTo = to+skipDist;
				
				if ( to <= x) {
					count++;
				}
				else if ( to < y ) {
					count++;
				}
				else if ( from < y && to >= y && to <= n) {
					// if skipped path にいる場合は除外
					if (! (from <= x ))
						count++;
				}
				else if ( from >= y && to <= n){
					count ++;
				}
				
				// skip 分
				// to > y
				if (from <= x && skipTo >= y && skipTo <= n)
					count++;
			}

			log(count);
		}
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}
	
	
	class Plot{
		int x;
		
	}
}
