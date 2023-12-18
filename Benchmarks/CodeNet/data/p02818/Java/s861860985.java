import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long k = stdIn.nextLong();
		
		for(long i = k; i > 0; i--) {
			if(a>=1) {
				a--;
			}else if(b >=1){
				b--;
			}else {
				System.out.println(0+" "+0);
				System.exit(0);
			}
		}
		System.out.println(a+" "+b);
		
		
		
		
		
		
		
		
	}

}
