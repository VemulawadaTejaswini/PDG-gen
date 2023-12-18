
import java.io.*;
import java.util.*;

class Main{
	int max = 0;
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		boolean[] judge = new boolean[n];
		Arrays.fill(judge, true);
		int count = 0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int now = -1;
			int y = 2000;
			for(int j=0;j<n;j++){
				if(!judge[j]){
					continue;
				}
				if(a[i]<=c[j] && b[i]<=d[j]){
					if(y>d[j]){
						now = j;
						y = d[j];
					}
				}
			}
			if(now!=-1){
				count++;
				judge[now] = false;
			}
		}
		System.out.println(count);
	}
}
