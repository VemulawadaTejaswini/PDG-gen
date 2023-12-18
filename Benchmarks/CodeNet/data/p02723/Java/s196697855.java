import java.util.*;

public class Main {

	
	// test #A
//	public static void main(String args[]) {
//		System.out.println("staring #1");
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		String s = sc.next();
//		
//		System.out.println(a+b+c+" "+s);
//		sc.close();
//	}

	// test #1  0322
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();		
		
		char array[] = input.toCharArray();
		
		boolean like = false;
		
		if ( (array[2] == array[3]) && (array[4]==array[5] ) )
			like = true;
		
		
		log( like ? "Yes" : "No" );
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}
	
}
