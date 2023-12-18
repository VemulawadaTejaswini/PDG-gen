import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 3:55:23 AM
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int N = mScanner.nextInt();
		int M= mScanner.nextInt();
		int sum = 0;
		for (int i = 0; i < M; i++) {
			int a = mScanner.nextInt();
			sum+=a;
			
		}
		if (sum>N) {
			System.out.println(-1);
		}else {
			System.out.println(N-sum);
		}
	}

}
