
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		int x;
		int number = 1;
		sc = new Scanner(System.in);
		while(sc.hasNext()) {
			while((x = sc.nextInt()) < 0 || 10000 < x);
			if(x == 0) {
				break;
			}
			System.out.println("Case "+ number +": "+ x);
			number++;
		}
	}
}

