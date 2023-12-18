import java.util.Scanner;

class Main{
	public static void main(String[] unko) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] mizuyoukan=new int[N];
		long[] nagasa=new long[N];
		int nitoubun=2;		// nitoubun=2 nara mizuyoukan[1] to mizuyoukan[2] no aida de kiru
		long delta=114514810114514810L;
		nagasa[0]=0;
		for(int i=0; i<N; i++) {
			mizuyoukan[i]=sc.nextInt();
			if(i==0) {
				nagasa[0]=mizuyoukan[0];
			}
			else {
				nagasa[i]+=nagasa[i-1]+mizuyoukan[i];
			}
		}

		long max=0,min=0;
		long P=0,Q=0,R=0,S=0;

		for(int i=2; i<=N-2; i++) {
			nitoubun=i;

			for(int j=1; j<nitoubun; j++) {
				P=nagasa[j-1];
				Q=nagasa[nitoubun-1]-P;

				for(int k=nitoubun+1; k<=N-1; k++) {
					R=nagasa[k-1]-nagasa[nitoubun-1];
					S=nagasa[N-1]-nagasa[k-1];
					max=Math.max(Math.max(P,Q),Math.max(R, S));
					min=Math.min(Math.min(P,Q),Math.min(R, S));
					delta=Math.min(max-min, delta);
				}
			}
		}
		System.out.println(delta);
	}
}