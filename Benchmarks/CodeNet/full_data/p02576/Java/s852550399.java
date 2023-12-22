
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count= 0;

		String L = scan.nextLine();
		String[] l = L.split(" ");

		int n = Integer.parseInt(l[0]);
		int x = Integer.parseInt(l[1]);
		int t = Integer.parseInt(l[2]);

		if(n % x == 0) {
			count = n / x;
		}else {
			count = n / x +1;
		}

		System.out.println(count * t);

		scan.close();


	}

}
