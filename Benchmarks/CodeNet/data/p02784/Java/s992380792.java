
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int N = scan.nextInt();

		int a[] = new int[10000];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		boolean flag = false;
		for(int i = 0; i < N; i++) {
			if(H - a[i]*2 <= 0) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}