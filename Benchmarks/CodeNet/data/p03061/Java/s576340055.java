import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		long max=0;
		if(N==2){
			max=Math.max(max, gcd(A[0],A[1]));
		}else{
			for(int i=0;i<N;i++){
				long[] p=new long[N-1];
				int it=0;
				for(int j=0;j<N;j++){
					if(i==j)continue;
					p[it++]=A[j];
				}
				max=Math.max(max,gcd(p));
			}
		}
		System.out.println(max);
	}

	public static final long gcd(long[] v) {
		int len = v.length;
		long g = gcd(v[0], v[1]);
		for (int i=1;i<len-1;i++){
			g = gcd(g, v[i+1]);
		}
		return g;
	}

	public static final long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		long r = -1;
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
