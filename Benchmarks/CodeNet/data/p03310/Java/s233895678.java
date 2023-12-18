import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long[] sum = new long[N+1];
		for(int i=0;i<N;++i){
			a[i] = sc.nextLong();
			sum[i] = 0;
		}
		sum[N] = 0;
		for(int i=1;i<=N;++i) sum[i] = sum[i-1] + a[i-1];
		
        long ans = Long.MAX_VALUE;
		for(int border=2;border<=N-2;++border){
			long x1,x2,x3,x4;
			int left = 1;
			int right = border;
			while(left+1<right){
				int center = (left+right)/2;
				if(sum[border]-sum[center]<sum[center]) right = center;
				else left = center;
			}
            if(border!=2&&Math.abs(sum[border]-2*sum[left])>Math.abs(sum[border]-2*sum[left+1])) left++;
            if(border!=2&&Math.abs(sum[border]-2*sum[left])>Math.abs(sum[border]-2*sum[left-1])) left--;
			x1 = sum[left];
			x2 = sum[border]-sum[left];

			left = border+1;
			right = N;
			while(left+1<right){
				int center = (left+right)/2;
				if(sum[N]-sum[center]<sum[center]-sum[border]) right = center;
				else left = center;
			}
            if(border!=N-2&&Math.abs(sum[N]+sum[border]-2*sum[left])>Math.abs(sum[N]+sum[border]-2*sum[left+1])) left++;
            if(border!=N-2&&Math.abs(sum[N]+sum[border]-2*sum[left])>Math.abs(sum[N]+sum[border]-2*sum[left-1])) left--;
			x3 = sum[left] - sum[border];
			x4 = sum[N] - sum[left];

			long max = Math.max(Math.max(x1,x2),Math.max(x3,x4));
			long min = Math.min(Math.min(x1,x2),Math.min(x3,x4));
            if(max-min < ans) ans = max-min;
            //System.out.println(x1+" "+x2+" "+x3+" "+x4);
		}
		System.out.println(ans);
		return;
	}
}