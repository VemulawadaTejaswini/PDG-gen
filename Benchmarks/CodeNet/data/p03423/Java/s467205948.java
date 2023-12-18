import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		int ans = n / 3;

//		if(n % 3 > 0 && ans > 0) {
//			ans++;
//		}

		System.out.println(ans);
	}

}
