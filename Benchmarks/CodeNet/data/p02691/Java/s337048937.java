import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		LinkedList<Integer> ll = new LinkedList<Integer>();
		for ( int i=0; i<n; i++ ) {
			ll.add(sc.nextInt());
		}

		int g = 0;
		for ( int i=0; i<n; i++ ) {
			int ai = ll.get(i);
			int d = 0;
			for ( int j=i+1; j<n; j++ ) {
				d++;
				int aj = ll.get(j);
				if ( ai+aj==d ) {
					g++;
				}
			}
		}
		System.out.println(g);
	}
}
