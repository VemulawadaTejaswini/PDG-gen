
import java.io.*;
import java.security.acl.Group;
import java.util.*;

//@2001  Ý¾­¶
public class Main {

	static class Bar implements Comparable<Bar> {
		int h;
		int p;
		int q;
		public Bar(int h, int p, int q) {
			this.h = h;
			this.p = p;
			this.q = q;
		}
		@Override
		public int compareTo(Bar o) { // ~
			return o.h - h;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		for(int loop = 0;; loop++) {

			List<Bar> list = new ArrayList<Bar>();

			String s = reader.readLine();
			String[] sp = s.split(" ");
			int N = Integer.parseInt(sp[0]);
			int M = Integer.parseInt(sp[1]);
			int A = Integer.parseInt(sp[2]);
			if (N == 0)
				break;

			for(int i = 0; i < M; i++) {
				s = reader.readLine();
				sp = s.split(" ");
				int h = Integer.parseInt(sp[0]);
				int p = Integer.parseInt(sp[1]);
				int q = Integer.parseInt(sp[2]);
				
				Bar bar = new Bar(h, p, q);
				list.add(bar);
			}
			
			// ~É\[g
			Collections.sort(list);
			
			// »ÝÊu
			int pos = A;
			
			for(int i = 0; i < list.size(); i++) {
				Bar bar = list.get(i);
				if (pos == bar.p) {
					pos = bar.q;
				}
				else if (pos == bar.q) {
						pos = bar.p;
				}
			}
			
			System.out.printf("%d\n", pos);
				
		}		
		
		reader.close();
	}

}