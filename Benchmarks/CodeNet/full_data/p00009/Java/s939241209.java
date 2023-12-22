import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while (sc.hasNext()){

		int n = sc.nextInt();
		int x = 0;

		for (int i = 3; i <= n; i = i + 2) {
			for (int j = 3; j < Math.sqrt(i); j = j + 2) {
				int y = i % j;
				if (y == 0) {
					x = x + 1 ;
					break;
				}
			}
		}
		if ( n == 1){
			System.out.println(0);
		}else{
		if (n % 2 == 0){
			n = n/2 ;
		}else{
			n = (n + 1)/ 2;
		}
		System.out.println(n-x);
		}
		}
	}
}