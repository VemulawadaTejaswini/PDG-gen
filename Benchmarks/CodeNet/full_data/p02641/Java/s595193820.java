import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();

		HashSet<Integer> s = new HashSet<Integer>();
		for ( int i=0; i<n; i++ ) {
			s.add(sc.nextInt());
		}

		if ( ( n>0 && !s.contains(x) ) || n==0 ) {
			System.out.println(x);
			System.exit(0);
		}
		for ( int i=1; i<=110; i++ ) {
			if ( !s.contains(x-i) ) {
				System.out.println(x-i);
				System.exit(0);
			}
			if ( !s.contains(x+i) ) {
				System.out.println(x+i);
				System.exit(0);
			}
		}
	}
}