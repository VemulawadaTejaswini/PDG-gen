import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			boolean[] a = new boolean[2*n+1];
			boolean[] b = new boolean[2*n+1];

			Arrays.fill(b, true);

			for(int i = 0; i < n; i++) {
				int in = sc.nextInt();
				a[in] = true;
				b[in] = false;
			}
			b[0] = false;
			ArrayList<Integer> A = new ArrayList<Integer>();
			ArrayList<Integer> B = new ArrayList<Integer>();

			for(int i = 0; i < 2*n+1; i++) {
				if(a[i]) A.add(i);
				if(b[i]) B.add(i);
			}

			Collections.sort(A);
			Collections.sort(B);

			int last = 0;

			while(!A.isEmpty() && !B.isEmpty()) {
				boolean ok = false;
				for(int i = 0; i < A.size(); i++) {
					if(A.get(i) > last) {
						last = A.get(i);
						A.remove(i);
						ok = true;
						break;
					}
				}
				if(!ok) {
					last = 0;
				}
				if(A.isEmpty()) break;
				ok = false;
				for(int i = 0; i < B.size(); i++) {
					if(B.get(i) > last) {
						last = B.get(i);
						B.remove(i);
						ok = true;
						break;
					}
				}
				if(!ok) {
					last = 0;
				}
			}

			int as = B.size();
			int bs = A.size();

			System.out.println(as + "\n" + bs);






		}

	}


}