import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		long k = stdIn.nextLong();
		
		if(a-b>1e18) {
			System.out.println("Unfair");
		}else {	
		System.out.println(a-b);
		}
/*		for(int i = 0; i < k; i++) {
			long atmp = a;
			long btmp = b;
			a = b+c;
			b = atmp + c;
			c = atmp + btmp;
		}
		if(a-b>1e18) {
			System.out.println("Unfair");
		}else {	
		System.out.println(a-b);
		}
		*/
	}

}
