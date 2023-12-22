import java.util.*;
public class Main {	
	public static int check(long p,int[] T,int k,int n){
		int i =0;
		for(int j=0;j<k;j++){
			long  s = 0;
			while(s+T[i]<=p){
				s +=T[i];
				i++;
				if(i==n) return n;
			}
		}
		return i ;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		int[] T = new int[n];
		for(int i=0;i<n;i++){
			T[i] = sc.nextInt();
		}
		long l=0;
		long r = 100000*10000;
		long mid=0 ;
		while(r-l>1){
			 mid = l+(r-l)/2;
			int v = check(mid,T,k,n);
			if(v>=n) r=mid;
			else l = mid;
		}
		System.out.println(mid);
		
	}
}