import java.util.*;

class Main{
	public static void main(String[] $) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt(),r=s.nextInt();

		if(l%2019==0||r%2019==0||l/2019<r/2019) {
			System.out.println(0);
			return;
		}

		long res=Integer.MAX_VALUE;
		for(long i=l;i<=r;++i) {
			for(long j=i+1;j<=r;++j) {
				res=Math.min(res,i%2019*j%2019);
			}
		}
		System.out.println(res);
	}
}