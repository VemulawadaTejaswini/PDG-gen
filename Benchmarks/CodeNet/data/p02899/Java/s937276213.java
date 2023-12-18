


import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		//String[] h1 = sc.nextLine().split(" ");

		//int intK = Integer.parseInt(h1[1]);


		int intN = Integer.parseInt(n);
		int[] ans = new int[intN];

		String[] a = sc.nextLine().split(" ");

		int sum=0;

		String answer = "";
		for (int i = 0;i < intN;i++) {
			ans[Integer.parseInt(a[i])]=i+1;

			if (i==0) {
				answer=String.valueOf(ans[i]);
			} else {
				answer=answer + " " + String.valueOf(ans[i]);
			}
		}


		System.out.println(answer);


		//int a = Integer.parseInt("");
		//for (int i = 0;i < intN;i++) {
		//sum=sum+i;
	//}

	}
}
