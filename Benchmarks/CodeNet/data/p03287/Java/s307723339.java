import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		long[] box=new long[N];

		for(int i=0; i<N; i++) {
			box[i]=sc.nextLong();
		}
		long[] wa=new long[N+1];
		wa[0]=0;
		for(int i=1; i<=N; i++) {
			wa[i]=wa[i-1]+box[i-1];
		}
		for(int i=0; i<=N; i++) {
			wa[i]=wa[i]%M;
		}
		int[] kosu=new int[M];

		for(int i=0; i<=N; i++) {
			kosu[(int)wa[i]]++;
		}

		long souwa=0;

		for(int i=0; i<M; i++) {
			if(kosu[i]<2) {
				//
			}
			else {
				souwa+=(kosu[i]*(kosu[i]-1)/2);
			}
		}

		System.out.println(souwa);
	}
}