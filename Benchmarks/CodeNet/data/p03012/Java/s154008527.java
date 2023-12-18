// Balance_128_B

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] W = new int[N];
		int[] sub = new int[N];
		int ans;

		for(int i=0;i<N;i++) {
			W[i] = scan.nextInt();
			}

		for(int i=0;i<N;i++) {
			int S1=0,S2=0;
			for(int k=i;k>=0;k--) {
				S1 = S1 + W[k];
			}
			for(int k=i+1;k<N;k++) {
				S2 = S2 + W[k];
			}
//			System.out.println(i+"回目, S1, S2="+S1+", "+S2);
			sub[i] = Math.abs(S1-S2);
		}

		ans = sub[0];

		for(int n:sub) {
			if(ans>n) {
				ans = n;
			}
		}

//		for(int n:sub) {
//			System.out.print(n+" ");
//		}

		System.out.println(ans);

		scan.close();
	}

}
