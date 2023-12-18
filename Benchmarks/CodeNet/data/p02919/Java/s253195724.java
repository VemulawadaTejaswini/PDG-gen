import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int P[]=new int[N];
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt();
		}
		int max=Integer.MAX_VALUE;//[][] =new int[N-1][N-1];
		int X=0;///[][]=new int[N-1][N-1];
		long sum=0;
		for(int L=0;L<N-1;L++) {
			for(int R=L+1;R<=N-1;R++) {
				if(R==L+1) {
					max=Math.max(P[L], P[L+1]);
					X=P[L]+P[L+1]-Math.max(P[L], P[L+1]);
					//max[L][R-1]=Math.max(P[L], P[L+1]);
					//X[L][R-1]=P[L]+P[L+1]-Math.max(P[L], P[L+1]);
				}else {
					if(X>P[R]) {


					}else if(max<P[R]) {
						X=max;
						max=P[R];
					}else {
						X=P[R];
						//max=max[L][R-2];
					}
				}
				sum+=X;
				//System.out.println(L+" "+R+" "+X[L][R-1]);
			}
		}
		System.out.println(sum);
	}


}
