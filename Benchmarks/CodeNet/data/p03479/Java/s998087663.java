import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long X = in.nextLong();
		long Y = in.nextLong();
		int counter = 0;
		
		for(long i=X; i<=Y; i*=2) {
			counter += 1;
		}
		System.out.println(counter);
	}

}
