import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		//System.out.println(s3);

		if(1 <= k && k <= a) {
			System.out.println(k);
		} else if(a < k && k <= a + b){
			System.out.println(a);
		} else {
			System.out.println(a - (k - a - b));
		}

		sc.close();

	}

}
