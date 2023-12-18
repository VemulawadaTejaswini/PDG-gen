import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N,K;
		N = s.nextInt();
		K = s.nextInt();
		int xp[] = new int[N];
		int sp = -1;
		for(int i=0;i<N;i++) {
			xp[i] =s.nextInt();
			
			if(i==0&&xp[i]>=0) {
				sp=0;
			}else if(xp[i]>=0&&xp[i-1]<0){
				sp=i;
			}
		}
		
		int step =1000000000;
		if(sp<1) {
			if(xp[0]>=0) {
				step=Math.abs(xp[K-1]);
			}else if(xp[N-1]<=0) {
				step=Math.abs(xp[N-K]);
			}
		}else{
			if(sp>=K) {
				step=getstep(xp,K,K,sp);
			}else {
				step=getstep(xp,sp,K,sp);
			}
			
			
		}
		
		System.out.println(step);					
	}
	
	public static int getstep(int[] a, int qd,int cd,int yd) {
		int st =1000000000;
		int tst=0;
		int ls=0;
		int rs=0;
		for(int i=0;i<cd;i++) {
			
			ls=Math.abs(a[yd-qd+i]);
			if(cd-1+i>=Array.getLength(a)) {
				break;
			}
			rs=Math.abs(a[cd-1+i]);
		
			if(ls>rs) {
				tst=2*rs+ls;
			}else {
				tst=2*ls+rs;
			}
			if(tst<st) {
				st=tst;
			}
			
		}
		
		
		
		
		
		return st;
	}

}