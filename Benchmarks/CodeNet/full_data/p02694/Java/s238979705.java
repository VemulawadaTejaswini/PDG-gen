import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long x = stdIn.nextLong();
		long step = 0;
		long a = 100;
		while(a < x) {
			a+= a/100;
			step++;
		}
		System.out.println(step);
		
		
	}

}
