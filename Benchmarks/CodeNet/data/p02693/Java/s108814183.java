
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean found = false;
		for (int j = A; j <= B; j++) {
			if(j%K == 0) {
				System.out.println("OK");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("NG");
		}
		sc.close();
	}

}
