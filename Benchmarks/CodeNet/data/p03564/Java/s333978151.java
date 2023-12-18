import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int r = 1;
		
		for(int i = 1; i <= n; i++) {
			if(k >r) {
				r *= 2;
			} else {
				r += k;
			}
		}

		System.out.println(r);

	}

}
