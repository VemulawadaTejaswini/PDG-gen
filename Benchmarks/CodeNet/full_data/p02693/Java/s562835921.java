import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean jg = false;

		for (int num = A; num <= B; num++) {
			if(num%K==0) {
				jg=true;
			}
		}
		if(jg) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

	}
}
