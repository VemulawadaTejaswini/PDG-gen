import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int x = stdIn.nextInt();
			int h = stdIn.nextInt();
			if(x == 0 && h == 0) break;
			System.out.println((x * Math.sqrt(4 * h * h + x * x) + x * x));
		}
	}
}