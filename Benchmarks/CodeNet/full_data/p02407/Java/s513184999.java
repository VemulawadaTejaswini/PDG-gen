

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		int N[] = new int[n];

		for (int i=0; i<n; i++) {
			N[i] = sc.nextInt();
		}

		for (int i = n-1; i>=0; i--) {
			if (i>0) {
				System.out.print(N[i] + " ");
			}else if (i==0) {
				System.out.println(N[i]);
			}
		}
	}
}
