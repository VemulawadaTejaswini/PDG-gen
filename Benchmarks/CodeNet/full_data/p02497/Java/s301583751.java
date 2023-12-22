import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int m = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			if(m == -1 && (f == -1 && r == -1)) break;
			
			if(m + f < 30 || (m == -1 || f == -1)) {
				System.out.println("F");
			} else if(m + f > 79) {
				System.out.println("A");
			} else if(m + f > 64) {
				System.out.println("B");
			} else if(m + f > 49 || r > 49) {
				System.out.println("C");
			} else if(m + f > 29) {
				System.out.println("D");
			}
		}
	}

}