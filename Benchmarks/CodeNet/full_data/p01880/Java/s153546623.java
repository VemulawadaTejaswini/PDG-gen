import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int ans = -1;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int x = a[i]*a[j];
				String s = String.valueOf(x);
				boolean judge = true;
				for(int k=0;k<s.length()-1;k++){
					if((int)s.charAt(k)!=(int)s.charAt(k+1)-1){
						judge = false;
					}
				}
				if(judge){
					ans = Math.max(ans,x);
				}
			}
		}

		System.out.println(ans);
	}
}