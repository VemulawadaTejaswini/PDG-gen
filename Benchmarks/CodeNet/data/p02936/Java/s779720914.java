import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {

		int N = MyScanner.nextInt();
		int Q = MyScanner.nextInt();
		Map<Integer, Node> m = new HashMap<>();

		for(int i = 0; i < N-1; i++) {
			int a=MyScanner.nextInt();
			int b=MyScanner.nextInt();
			Node n1=m.get(a); if(n1==null) m.put(a, n1=new Node(a));
			Node n2=m.get(b); if(n2==null) m.put(b, n2=new Node(b));
			if(a<b) n1.setChild(n2);
			else n2.setChild(n1);
		}

		for(int i=0; i<Q;i++) m.get(MyScanner.nextInt()).ope(MyScanner.nextInt());
		for(Node n: m.values()) {
			if(n.n!=1) System.out.print(" ");
			System.out.print(n.v);
		}
	}

	public static class MyScanner{
		static Scanner sc = new Scanner(System.in);
		static String nextLine() {return sc.nextLine();}
		static String next() {return sc.next();}
		static int nextInt() {return Integer.valueOf(sc.next());}
	}

	public static class Node{
		List<Node> c = new ArrayList<>();
		int n;
		long v = 0; 
		Node(int i){n=i;}
		void setChild(Node n) {c.add(n);}
		void ope(int i) {v+=i;c.forEach(n->n.ope(i));}
		@Override
		public int hashCode() {return n;}
	}
}