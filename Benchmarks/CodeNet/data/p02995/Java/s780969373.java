import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static long lcm (int a, int b) {return a*b/gcd(a,b);}
	static long llcm (long a, long b) {return a*b/lgcd(a,b);}
	static long lgcd(long a,long b) {return b>0?lgcd(b,b%a):a;}
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
	
		public static void main(String[] args) {
			long a=scan.nextLong()-1;
			long b=scan.nextLong();
			long c=scan.nextLong();
			long d=scan.nextLong();
			long e=llcm(c,d);
			long uo1=b/c;
			long uo2=b/d;
			long uo3=b/e;
			long B=b-(uo1+uo2-uo3);
			long uw1=a/c;
			long uw2=a/d;
			long uw3=a/e;
			long A=a-(uw1+uw2-uw3);
			System.out.println(B-A);
		}
}