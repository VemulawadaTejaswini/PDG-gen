import java.util.Scanner;
public class Main {
	static long mod=(long)(Math.pow(10.0, 9.0)+7);
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
	//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));
	
	public static void main(String[] args) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		switch(a) {	
		case 1:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 2:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 3:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 4:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 5:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 6:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 7:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 8:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 9:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 10:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 11:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 12:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 13:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 14:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 15:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 16:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 17:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 18:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 19:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 20:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 21:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 22:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 23:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 24:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 25:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 26:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 27:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 28:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 29:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 30:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 31:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 32:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 33:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 34:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 35:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 36:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 37:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 38:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 39:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 40:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 41:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 42:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 43:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 44:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 45:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 46:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 47:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 48:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 49:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 50:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 51:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 52:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 53:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 54:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 55:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 56:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 57:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 58:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 59:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 60:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 61:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 62:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 63:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 64:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 65:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 66:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 67:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 68:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 69:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 70:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 71:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 72:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 73:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 74:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 75:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 76:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 77:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 78:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 79:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 80:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 81:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 82:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 83:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 84:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 85:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 86:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 87:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 88:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 89:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 90:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 91:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 92:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 93:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 94:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 95:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 96:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 97:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 98:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 99:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
		case 100:
			switch(b) {
			case 1:System.out.println();break;
			case 2:System.out.println();break;
			case 3:System.out.println();break;
			case 4:System.out.println();break;
			case 5:System.out.println();break;
			}
			break;
			
			
		}
	}
}