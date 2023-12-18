import java.util.*;

public class Main {

	// test 4  D
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// num of points
		int x = sc.nextInt();		// point X
		int y = sc.nextInt();		// point Y
		
		int ary_pathes[] = new int[n+1];

		// initialize array
		for (int i=1; i<=n; i++) {
			ary_pathes[i] = 0;
		}
		
		// node 1 からの loop
		for (int from=1; from<n; from++) {
			
			for(int to=from+1; to<=n; to++) {
				int len_normal;
				int len_skip;
				
				// 1: no skip
				len_normal = to-from;
				
				// 2: X-Y 通過
				len_skip=Math.abs(x-from) + 1 + Math.abs(to-y);
				
				if (len_skip < len_normal)
					ary_pathes[len_skip]++;
				else
					ary_pathes[len_normal]++;
			}
		}

		for (int i=1; i<n; i++) {
			log( ary_pathes[i]);
		}

		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

}
