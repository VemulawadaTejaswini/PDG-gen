import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		int max=0;
		if(N==2){
			max=Math.max(A[0],A[1]);
		}else{
			for(int i=0;i<N;i++)max=Math.max(max,gcd(A,i,N));
		}
		System.out.println(max);
	}

	public static final int gcd(int[] v,int j,int len) {
		int g=0;
		if(j>1){
			g = gcd(v[0], v[1]);
		}else if(j==1){
			g = gcd(v[0], v[2]);
		}else{
			g = gcd(v[1], v[2]);
		}
		for (int i=1;i<len-1;i++){
			if(j==i+1)continue;
			g = gcd(g, v[i+1]);
		}
		return g;
	}

	private static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

}