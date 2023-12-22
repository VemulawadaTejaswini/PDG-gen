import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		V V[] = new V[n];
		for (int i = 0; i < n; i ++) {
			V[i] = new V();
		}
		
		for (int i = 0; i < n; i ++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j ++) {
				E e = new E();
				e.v = V[scanner.nextInt()];
				e.c = scanner.nextInt();
				V[u].e.add(e);
			}
			V[u].d = Integer.MAX_VALUE;
		}
		
		PriorityQueue<V> heep = new PriorityQueue<>();
		
		for (int i = 0; i < n; i ++) {
			heep.add(V[i]);
		}
		
		scanner.close();
		
		V[0].d = 0;
		
		for(int i = 0; i < n; i ++) {
			V u = heep.remove();
			
			u.fixed = true;
			for (E j: u.e) {
				if (j.v.fixed == false && u.d + j.c < j.v.d) {
					j.v.d = u.d + j.c;
					heep.remove(j.v);
					heep.add(j.v);
				}
			}
		}
		
		for (int i = 0; i < n; i ++) {
			System.out.println(i + " " + V[i].d);
		}
	}
	
	private static class E {
		V v;
		int c;
	}
	
	private static class V implements Comparable {
		List<E> e = new LinkedList<>();
		int d;
		boolean fixed;

		public int compareTo(Object p1)
		{
			return d - ((V) p1).d;
		}
	}
} 

