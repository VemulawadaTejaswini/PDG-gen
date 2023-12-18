import java.util.Scanner;
public class Main {
	static int mod=1000000007;
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static int max(int a,int b) {return a>b?a:b;}
	static int min(int a,int b) {return a<b?a:b;}
	static long factorial(int i) {return i==1?1:i*factorial(i-1);}
	static int lower_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<=key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static int upper_bound(int a[],int key) {
		int low=0,high=a.length;
		while(low<high) {
			int mid=((high-low)/2)+low;
			if(a[mid]<key)low=mid+1;
			else high=mid;
		}
		return high;
		}
	static boolean isPrime (int n) {
		if (n==2) return true;
		if (n<2 || n%2==0) return false;
		double d = Math.sqrt(n);
		for (int i=3; i<=d; i+=2)if(n%i==0){return false;}
		return true;
	}
	static int upper_division(int a,int b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lupper_division(long a,long b) {
		if(a%b==0) {
			return a/b;
		}
		else {
			return a/b+1;
		}
	}
	static long lmax(long a,long b) {return Math.max(a, b);}
	static long lmin(long a,long b) {return Math.min(a, b);}
	static int[] setArray(int a) {
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
		}
		return b;
	}
	static String reverce(String str) {
		String strr="";
		for(int i=str.length()-1;i>=0;i--) {
			strr+=str.charAt(i);
		}
		return strr;
	}
	public static void main(String[]args){
		int a=scan.nextInt();
		int b=scan.nextInt();
		int dp[][]=new int[a][b];
		int c=scan.nextInt();
		int d=scan.nextInt();
		for(int i=a-c;i<a;i++) {
			for(int j=0;j<d;j++) {
				dp[i][j]=-1;
			}
		}
		for(int i=0;i<a-c;i++) {
			dp[i][0]=1;
		}
		for(int j=0;j<b;j++) {
			dp[0][j]=1;
		}
		
		for(int i=1;i<a;i++) {
			for(int j=1;j<b;j++) {
				if(dp[i][j]!=-1) {
					long x=dp[i-1][j]==-1?0:dp[i-1][j];
					long y=dp[i][j-1]==-1?0:dp[i][j-1];
					dp[i][j]=(int) ((x+y)%mod);				
				}
			}
		}
		System.out.println(dp[a-1][b-1]%mod);
	}
}