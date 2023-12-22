import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() , tmp;
		if ( a > b ) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if ( b > c ) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if ( a > b ) {
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a+" "+b+" "+c);
	}
}