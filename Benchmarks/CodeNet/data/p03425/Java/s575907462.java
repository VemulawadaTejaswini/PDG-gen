import java.util.Scanner;
public class Main {
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
	public static void main(String[] args) {
		int z=scan.nextInt();
		int m=0,a=0,r=0,c=0,h=0;
		for(int i=0;i<z;i++) {
			String str=scan.next();
			char ch=str.charAt(0);
			switch(ch) {
			case 'M':m++;break;
			case 'A':a++;break;
			case 'R':r++;break;
			case 'C':c++;break;
			case 'H':h++;break;
			}
		}
		int ans=0;//mar,mac,mah,mrc,mrh,mch,arc,arh,ach,rch
		ans+=m*a*r;
		ans+=m*a*c;
		ans+=m*a*h;
		ans+=m*r*c;
		ans+=m*r*h;
		ans+=m*c*h;
		ans+=a*r*c;
		ans+=a*r*h;
		ans+=a*c*h;
		ans+=r*c*h;
		System.out.println(ans);
	}
}