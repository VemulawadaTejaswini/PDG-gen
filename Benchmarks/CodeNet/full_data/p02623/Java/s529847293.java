import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Pair implements Comparable<Pair>{

		public Pair(int v, int label) {
			super();
			this.v = v;
			this.label = label;
		}

		int v;
		int label;

		@Override
		public int compareTo(Pair o) {
			return v-o.v;
		}

		@Override
		public String toString() {
			return "Pair [v=" + v + ", label=" + label + "]";
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		List<Pair> list = new ArrayList<>();
		for( int i=0 ; i < n ; i++ ) {
			list.add(new Pair(sc.nextInt(), 0));
		}

		for( int i=0 ; i < m ; i++ ) {
			list.add(new Pair(sc.nextInt(), 1));
		}

		list.sort( (lt,rt) -> lt.v-rt.v );
		
		long s=0;
		int c =0;
		for( Pair it :list) {
			if( s + it.v > k ) break;
			s+= it.v;
			c++;
		}
		
		
		
		System.out.println(c);
	}

}
