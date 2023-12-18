package atcoder;

import java.util.Scanner;

public class atcoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) L[i] = sc.nextInt();
		int ans = 1;
		int sum = 0;

		for(int i = 0; i < N; i++) {
			sum += L[i];
			if(sum <= X){
				++ans;
			}

		}System.out.println(ans);
	}
}