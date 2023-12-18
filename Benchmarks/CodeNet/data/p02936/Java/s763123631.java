import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static void main(String[] args) {

		int N = MyScanner.nextInt();
		int Q = MyScanner.nextInt();
		Map<Integer, Node> m = new HashMap<>();

		System.out.println(System.currentTimeMillis());
		for(int i = 0; i < N-1; i++) {
			int a=MyScanner.nextInt();
			int b=MyScanner.nextInt();
			Node n1=m.get(a); if(n1==null) m.put(a, n1=new Node(a));
			Node n2=m.get(b); if(n2==null) m.put(b, n2=new Node(b));
			if(a<b) n1.c.add(n2);
			else n2.c.add(n1);
		}

		System.out.println(System.currentTimeMillis());
		for(int i=0; i<Q;i++) m.get(MyScanner.nextInt()).v+=MyScanner.nextInt();
		m.get(1).ope(0);

		System.out.println(System.currentTimeMillis());
		for(Node n: m.values()) {
			if(n.n!=1) System.out.print(" ");
			System.out.print(n.v);
		}
		System.out.println(System.currentTimeMillis());
	}

	public static class MyScanner{
		static Scanner sc = new Scanner(System.in);
		static String nextLine() {return sc.nextLine();}
		static String next() {return sc.next();}
		static int nextInt() {return Integer.valueOf(sc.next());}
	}

	public static class Node{
		Set<Node> c = new HashSet<>();
		int n;
		long v = 0; 
		Node(int i){n=i;}
		void ope(long i) {v+=i;for(Node n:c)n.ope(v);}
		@Override public int hashCode() {return n;}
	}
}