

import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String n = sc.nextLine();
		String[] h1 = sc.nextLine().split(" ");

		int intK = Integer.parseInt(h1[1]);

		int intN = Integer.parseInt(h1[0]);

		String[] h = sc.nextLine().split(" ");

		int sum=0;

		for (int i = 0;i < intN;i++) {
			if (Integer.parseInt(h[i]) >= intK) {
                sum=sum+1;
			}

		}

		System.out.println(sum);


		//int a = Integer.parseInt("");
		//for (int i = 0;i < intN;i++) {
		//sum=sum+i;
	//}

	}
}
