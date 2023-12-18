import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] f = new int[n];

		LinkedList<Integer> ll = new LinkedList<Integer>();
		for ( int i=0; i<n; i++ ) {
			ll.addLast(sc.nextInt());
			if ( ll.get(i)>n ) f[i]++;
		}

		int g = 0;
		for ( int i=0; i<n; i++ ) {
			int ai = ll.get(i);
			if ( f[i]==1 ) continue;
			for ( int j=i+ai; j<n; j++ ) {
				int aj = ll.get(j);
				if ( f[j]==1 ) continue;
				if ( ai+aj==j-i ) {
					g++;
				}
			}
		}
		System.out.println(g);
	}
}
