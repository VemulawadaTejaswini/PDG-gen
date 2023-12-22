import java.util.Scanner;
public class Main {

	static int func(int num) {
		return(num * num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		final int range = 600;
		int d;

		while(stdIn.hasNext()) {
			d = stdIn.nextInt();
			int quantity = range / d;

			long area = 0;
			for(int r = 1; r < quantity; r++) {
				area += func(r * d) * d; 
			}

			System.out.println(area);
		}
	}

}