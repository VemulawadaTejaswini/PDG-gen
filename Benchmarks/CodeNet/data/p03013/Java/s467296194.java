import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean[] a=new boolean[n+1];
		for(int i=1;i<=n;i++){
			i=sc.nextInt();
			a[i]=false;
		}
 
		int r=1_000_000_007;
		long[] d=new long[n+1];
		d[0]=1;
		for(int i=1;i<n+1;i++){
          	int p;
			if(a[i]!=false){
				if(i=1)
					p=i-1;
				else
					p=i-2;
				for(int j=p;j<i;j++)
				d[i]+=d[j];
				d[i]%=r;
			}else if(a[i]==false){
				d[i]=0;
			}
		}
		System.out.println(d[n]%r);
		
	}
}