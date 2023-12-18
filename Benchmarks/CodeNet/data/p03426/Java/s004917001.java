//package solve;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),H=in.nextInt(),d=in.nextInt();
		int num[]=new int[N*H];
		for(int i=0;i<N*H;i++)num[i]=in.nextInt();
		int Q=in.nextInt();
		while(Q-->0) {
			int L=in.nextInt(),R=in.nextInt();
			int	a = 0,b = 0;
			for(int i=0;i<num.length;i++)
				if(num[i]==L) {
					 a=(i+1)%H;b=(i+1)/H;
					break;
				}
			long sum=0;
			while(L<R+d) {
			for(int i1=0;i1<num.length;i1++) {
				if(num[i1]==L) {
					int n=(i1+1)%H,m=(i1+1)/H;
					sum+=Math.abs(n-a)+Math.abs(b-m);
					a=n;b=m;
					break;
				}
			}	
			L+=d;	
			}
			System.out.println(sum);
	}

}