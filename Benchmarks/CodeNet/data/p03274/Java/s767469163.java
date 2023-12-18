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
			now_cost=ruikei[K-1+i]-ruikei[i];

			if(point[K-1+i]<0) {
				now_cost+=Math.abs(point[K-1+i]);
			}
			else if(point[K-1+i]>=0) {
				if(point[i]>=0) {
					now_cost+=point[i];
				}
				else if(point[i]<0) {
					now_cost+=Math.min(Math.abs(point[i]), point[K-1+i]);
				}
			}

			max=Math.min(max, now_cost);
		}

		System.out.println(max);
	}
}