import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		boolean flag = false;
		for (int i = A; i <= B; i++) {
			if (i % K == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
