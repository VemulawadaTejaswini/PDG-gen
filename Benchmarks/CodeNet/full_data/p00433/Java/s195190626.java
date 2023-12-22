
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int as = 0;
		int bs = 0;
		for(int i = 0; i < 4; i++) {
			as += stdIn.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			bs += stdIn.nextInt();
		}
		
		if(as < bs) {
			System.out.println(bs);
		}
		else if(as > bs) {
			System.out.println(as);
		}
		else {
			System.out.println(as);
		}
		
		
	}
}