import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int max=200000007;
		int now_cost=0;
		int[] point=new int[N];
		int[] ruikei=new int[N];
		ruikei[0]=0;

		for(int i=0; i<N; i++) {
			point[i]=sc.nextInt();
		}

		for(int i=1; i<N; i++) {
			ruikei[i]=ruikei[i-1]+point[i]-point[i-1];
		}
		for(int i=0; i<N-K+1; i++) {
			now_cost=0;
			now_cost=Math.abs(ruikei[K-1+i]-ruikei[i]);

			now_cost+=Math.min(Math.abs(point[i]), Math.abs(point[K-1+i]));
			max=Math.min(now_cost, max);
		}

		System.out.println(max);
	}
}