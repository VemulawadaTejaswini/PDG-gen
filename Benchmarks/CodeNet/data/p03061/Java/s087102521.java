import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int t=0;
		int max=0;
	/*	for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(i==0)
					t=a[1];
				else	
					t=a[0];
				if(j!=i)
				t=gcd(t,a[j]);
			}
			if(max<t)
				max=t;
				t=0;	
		}	*/
			int[] l=new int[n+1];
			l[0]=0;
			for(int j=0;j<n;j++){
				l[j+1]=gcd(l[j],a[j]);
			}
			int[] r=new int[n+1];
			r[n]=0;
			for(int j=n-1;j>0;j--){
				r[j]=gcd(r[j+1],a[j]);
			}
			for(int i=0;i<n;i++){
				max=Math.max(max,gcd(l[i],r[i+1]));
			}
		System.out.println(max);
	}
	static int gcd(int a,int b){
		int t;
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a<b){ 
			int p=a;
			a=b;
			b=p;
		}
		while((t=a%b)!=0){
			a=b;
			b=t;
			
		}
		return b;
	}
	
}