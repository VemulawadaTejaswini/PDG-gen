
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a =0;
		for(int i=0 ; i<m ; i++) {
			a = scanner.nextInt();
			if(a <= n) {
				n -= a;
			}else {
				n = -1;
				break;
			}
		}

		System.out.println(n);

		scanner.close();




	}

}
