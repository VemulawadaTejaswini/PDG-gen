
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {

		int i = 0;
		int x;
		int number = 1;
		int array_len = 0;
		int test[] = new int[array_len];
		sc = new Scanner(System.in);


		while(sc.hasNext()) {
			while((x = sc.nextInt()) < 0 || 10000 < x);
			if(x!= 0) {
				System.out.println("Case "+ number +": "+ x);
				number++;
			}else {
				System.out.println("Case "+ number +": "+ x);
				break;
			}
		}
	}
}

