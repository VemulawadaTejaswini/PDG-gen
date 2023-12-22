import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<>();
		
		for(int i = 0 ; i < n ; i++ ) {
			s.add(sc.nextInt());
		}
		Integer[] as = s.toArray(new Integer[0]);
		
		
		boolean isPairwise = true;
		all: for(int i = 0 ; i < s.size() ; i++ ) {
			for(int j = i+1 ; j < s.size() ; j++ ) {
				if( gcd( as[i], as[j] ) != 1 ) {
					isPairwise = false;
					break all;
				}
			}
		}
		
		if( isPairwise )
			System.out.println("pairwise coprime");
		else {
			boolean isSetwise = gcd(as) == 1;
			if( isSetwise )
				System.out.println("setwise coprime");
			else
				System.out.println("not coprime");
		}
		
	}
		
	static int gcd(Integer... array) {
		int gcd = 0;
		for(int i = 0; i < array.length; i ++) { gcd = gcd(gcd, array[i]); }
		return gcd;
	}
	
	static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }

}

