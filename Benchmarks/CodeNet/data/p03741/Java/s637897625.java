
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
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];        	
		}        
		long ans = 0;
		int count = a[0];
		for(int i=1;i<n;i++){
			if(count>=0 && count+a[i]>=0){
				int tmp = a[i];
				a[i] = -1 - count;
				ans += (long)Math.abs(tmp - a[i]);

			}
			else if(count<0 && count+a[i]<0){
				int tmp = a[i];
				a[i] = 1 - count;
				ans += (long)Math.abs(tmp - a[i]);
			}
			if(i==n-1 && count+a[i]==0){
				ans += 1;
				break;
			}
			count += a[i];
		}
		long bans =0;
		if(b[0]>=0){
			int x = 1 + b[0];
			b[0] = -1;
			bans = x;
		}
		else{
			int x = -b[0];
			b[0] = 0;
			bans = x;
		}
		count = b[0];
		for(int i=1;i<n;i++){
			if(count>=0 && count+b[i]>=0){
				int tmp = b[i];
				b[i] = -1 - count;
				bans += (long)Math.abs(tmp - b[i]);

			}
			else if(count<0 && count+b[i]<0){
				int tmp = b[i];
				b[i] = 1 - count;
				bans += (long)Math.abs(tmp - b[i]);
			}
			if(i==n-1 && count+b[i]==0){
				bans += 1;
				break;
			}
			count += b[i];
		}
		System.out.println(Math.min(ans, bans));
    }
}