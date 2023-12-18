
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int ans = 0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i] = sc.nextInt();
		}
		for(int i=0;i<30;i++){
			int[] aa = new int[n];
			int[] bb = new int[n];
			int x = (int)Math.pow(2, i+1);
			boolean flag = false;

			for(int j=0;j<n;j++){
				aa[j] = a[j] % x;
				bb[j] = b[j] % x; 
			}
			Arrays.sort(bb);
			for(int j=0;j<n;j++){
				int left = -1;
				int right = n;
				int t = 0;
				int t2 = 0;
				int t3 = 0;
				while(right-left>1){
					int center = (right+left)/2;
					if(aa[j]+bb[center]<x){
						left = center;
					}
					else if(aa[j]+bb[center]>=x){
						right = center;
					}
				}
				t = right;
				left = -1;
				right = n;
				while(right-left>1){
					int center = (right+left)/2;
					if(aa[j]+bb[center]<2*x){
						left = center;
					}
					else if(aa[j]+bb[center]>=2*x){
						right = center;
					}
				}
				t2 = right;
				left = -1;
				right = n;
				while(right-left>1){
					int center = (right+left)/2;
					if(aa[j]+bb[center]<3*x){
						left = center;
					}
					else if(aa[j]+bb[center]>=3*x){
						right = center;
					}
				}
				t3 = right;
				if(((t2-t)+(n-t3))%2==1){
					flag = !flag;
				}
			}
			if(flag){
				ans += x;
			}
		}
		System.out.println(ans);
	}
}

