import java.util.Scanner;

class Main{
	
	static int fib(int[] a,int n){
		for(int i=0;i<=n;i++){
			if(i==0 ||i==1)
				a[i]=1;
			else 
				a[i]=a[i-1]+a[i-2];
		}
		
		return a[n];
		
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n+1];
		System.out.println(fib(a,n));
	}
}
