import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mem = 0 ;
		
		if (a>b) {
			mem = a;
			a = b;
			b = mem;
		}
		if (b>c) {
			mem = b;
			b = c;
			c = mem;
		}
		if (a>b) {
			mem = a;
			a = b;
			b = mem;
		}
		
		System.out.println(a + " " + b + " " + c);
	}

}
