
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max = sc.nextLong();
		boolean flag = false;
		boolean ans = true;
		for(int i = 1; i < n; i++) {
			long tmp = sc.nextLong();
			long sub = tmp - max;
			if(sub == -1 && !flag) {
				flag = true;
				max = tmp;
			} else if(sub > 0) {
				flag = false;
				max = tmp;
			} else if(sub < -1) {
				ans = false;
				break;
			} else if(sub == -1 && flag) {
				ans = false;
				break;
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
