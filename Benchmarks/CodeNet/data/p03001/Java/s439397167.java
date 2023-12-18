import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long w = stdIn.nextInt();
		long h = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		
		if(2*x == w && 2*y == h) {
			System.out.println(w*h/2.0 + " 1");
		}else {
			System.out.println(w*h/2.0 + " 0");
		}
		
		
		
	}

}
