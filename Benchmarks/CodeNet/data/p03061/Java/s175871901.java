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
		for(int i=0;i<n;i++){
				if(i==0)
					t=a[1];
				else	
					t=a[0];
			for(int j=1;j<n;j++){
				if(j!=i)
				t=gcd(t,a[j]);
			}
			if(max<t)
				max=t;
				t=0;
		}
		System.out.println(max);
	}

	static int gcd(int a,int b){
		int t;
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