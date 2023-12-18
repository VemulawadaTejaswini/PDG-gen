import java.util.Scanner;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
	static long lcm (long a, long b) {return a*b/gcd(a,b);}
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
	static boolean isPrime (long n) {
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
	public static void printArray(int[] a) {
		for(int i=0;i<a.length-1;i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println(a[a.length-1]);
	}
	public static void main(String[] args) {
		String str=scan.next();
		long b=scan.nextLong();
		long cnt=1;
		long sum=0;
		long ans=0;
		for(int i=1;i<str.length();i++) {
			char ch=str.charAt(i-1);
			char ch2=str.charAt(i);
			if(ch==ch2) {
				cnt++;
			}
			else {
				sum+=cnt/2;
				cnt=1;
			}
		}
		ans=sum*b;
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			ans+=b;
		}
		System.out.println(ans);
	}
}