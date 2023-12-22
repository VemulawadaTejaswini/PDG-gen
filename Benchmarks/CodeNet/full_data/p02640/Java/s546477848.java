import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for ( int i=0; i<=x; i++ ) {
			int lg = i*2 + (x-i)*4;
			if ( lg==y ) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}