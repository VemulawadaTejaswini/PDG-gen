
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
			int x = (int)Math.pow(2, i);
			boolean flag = false;

			for(int j=0;j<n;j++){
				aa[j] = a[j] % x;
				bb[j] = b[j] % x; 
			}
			Arrays.sort(bb);
			for(int j=0;j<n;j++){
				int left = 0;
				int right = n;
				int l = 0;
				int r = 0;
				if(a[j]<x){
					while(right-left>1){
						int center = (right+left)/2;
						if(aa[j]+bb[center]<x){
							left = center;
						}
						else if(aa[j]+bb[center]>=x){
							right = center;
						}
					}
					l = left;
					left = 0;
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
					r = left;
					if((r-l)%2==1){
						flag = !flag;
					}
				}
				else{
					while(right-left>1){
						int center = (right+left)/2;
						if(aa[j]+bb[center]<2*x){
							left = center;
						}
						else if(aa[j]+bb[center]>=2*x){
							right = center;
						}
					}
					l = left;
					left = 0;
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
					r = left;
					if((n-r-l)%2==1){
						flag = !flag;
					}
				}

			}
			if(flag){
				ans += x;
			}
		}
		System.out.println(ans);
	}
}

