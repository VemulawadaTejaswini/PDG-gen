import java.util.*;
import java.io.*;

public class Main {
	static int a[], b[];
	static long cnt = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		a= new int[n];
		b= new int[n];
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i=1;i<=29;i++){
			int cntone = 0;
			int T = 1<<(i-1);
			int tmpb[] = new int[n];
			
			for(int j=0;j<n;j++){
				tmpb[j] = b[j]%(2*T);
			}
			
			Arrays.sort(tmpb);
			
			for(int j=0;j<n;j++){
				
				int l1 = binarySearch(tmpb, a[j]%(2*T), T);
				int r1 = binarySearch(tmpb, a[j]%(2*T), 2*T);
				
				int l2 = binarySearch(tmpb, a[j]%(2*T), 3*T);
				int r2 = binarySearch(tmpb, a[j]%(2*T), 4*T);
				
				cntone += (r1-l1)+(r2-l2);
			}
			
			if(cntone %2==1)
				ans |= 1<<(i-1);
		}
		System.out.println(ans);
	}
	static int binarySearch(int tmp[], int a, int T) {
		int l = 0, r = b.length;
		while(l<r){
			int mid=(l+r)/2;
			if(a+tmp[mid]>=T)	r = mid;
			else l = mid+1;
		}
		
		return l;
	}	
}