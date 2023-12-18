import java.util.Arrays;

import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N=sc.nextInt(),K=sc.nextInt();

		long h[]=new long[N],ans=Long.MAX_VALUE,min=0,max=0;

		for(int i=0;i<N;i++) {

			h[i]=sc.nextLong();

		}

		Arrays.sort(h);

		for(int i=K;i<=N;i++) {

          ans=Math.min(ans,h[i-1]-h[i-K]);

		}

      System.out.println(ans);

	}

}