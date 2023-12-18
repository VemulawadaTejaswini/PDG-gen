import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		int max=1;
		if(N==2){
			max=Math.max(A[0],A[1]);
		}else{
			int g=gcd(A[0], A[1]);
			for(int i=N-1;i>=0;i--){
				if(A[i]<max)continue;
				if(i==0){
					g=gcd(A[1], A[2]);
					max=Math.max(max,gcd(A,i,N,g));
				}else if(i==1){
					g=gcd(A[0], A[2]);
					max=Math.max(max,gcd(A,i,N,g));
				}else{
					max=Math.max(max,gcd(A,i,N,g));
				}
			}
		}
		System.out.println(max);
	}

	public static final int gcd(int[] v,int j,int len,int g) {
		for (int i=1;i<len-1;i++){
			if(j==i+1)continue;
			g = gcd(g, v[i+1]);
		}
		return g;
	}

	private static final int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

}