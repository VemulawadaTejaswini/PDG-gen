import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int mod=1000000007;
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
	static long modpow(long a,long n) {
		if(n==0) return 1;
		else if(n==1)return a;
		long tmp=modpow(a,n/2);
		tmp%=mod;
		tmp*=tmp;
		tmp%=mod;
		if(n%2==0)return tmp;
		else return (tmp*a)%mod;
	}
	static List<Long>list=new ArrayList<Long>();
	static long z;
	static void saiki(long a) {
		if(a>z) {
			return;
		}
		long x=10*a+3;
		long y=10*a+5;
		long z=10*a+7;
		list.add(x);
		list.add(y);
		list.add(z);
		saiki(x);
		saiki(y);
		saiki(z);
	}
	public static void main(String[] args) throws IOException {
		z=scan.nextLong();
		saiki(0);
		int cnt=0;
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			long x=list.get(i);
			if(x>z) {
				break;
			}
			String str=String.valueOf(x);
			if(str.indexOf("3")!=-1&&str.indexOf("5")!=-1&&str.indexOf("7")!=-1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
