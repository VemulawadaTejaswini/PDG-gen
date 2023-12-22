import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			a += scan.nextInt();
			
			int count = 1;
			while (a >= 10) {
				//System.out.println(a);
				count++;
				a /= 10;
			}
			System.out.println(count);
		}
	}

}