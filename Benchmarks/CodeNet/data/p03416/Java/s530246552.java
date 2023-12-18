import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int begin = sc.nextInt();
		int end = sc.nextInt();

		long cnt = 0;
		for (int i = begin; i <= end; i++) {
			String us = String.valueOf(i);
			String ret = new StringBuffer(us).reverse().toString();

			if (us.equals(ret)) {
				cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

}
