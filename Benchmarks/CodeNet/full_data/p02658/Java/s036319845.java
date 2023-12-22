import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] numberList = new long[n];
		long answer = 1;
		for(int i = 0;i < n;i++) {
			long number = sc.nextLong();
			if(number == 0) {
				System.out.println(0);
				return;
			}
			numberList[i] = number;

		}
		for(int i =0;i < n;i++) {
			answer *= numberList[i];
			if(answer >= (long)Math.pow(10,18)) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(answer);
	}

}