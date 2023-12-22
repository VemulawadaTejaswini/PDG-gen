import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean flag = false;
		for (int i = A; i <= B; i++) {
			if (i%K == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("OK");
		else
			System.out.println("NG");
	}
}