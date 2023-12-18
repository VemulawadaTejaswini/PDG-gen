import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
class FastScanner {private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}	
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
	public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
	public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
public class Main {
    static FastScanner scan=new FastScanner();
    static Scanner scanner=new Scanner(System.in);
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
    static int upper_division(int a,int b) {//切り上げ(int)
        if(a%b==0) {
            return a/b;
        }
        else {
            return a/b+1;
        }
    }
    static long lupper_division(long a,long b) {//切り上げ(long)
        if(a%b==0) {
            return a/b;
        }
        else {
            return a/b+1;
        }
    }
    static long lmax(long a,long b) {return Math.max(a, b);}
    static long lmin(long a,long b) {return Math.min(a, b);}
	static int[] setArray(int a) {//配列を作る
        int b[]=new int[a];
        for(int i=0;i<a;i++) {
            b[i]=scan.nextInt();
        }
        return b;
    }
    static String reverce(String str) {//文字列を逆にする
        String strr="";
        for(int i=str.length()-1;i>=0;i--) {
            strr+=str.charAt(i);
        }
        return strr;
    }
    public static void printArray(boolean[] visited2) {//配列の空白付き出力
        for(int i=0;i<visited2.length-1;i++) {
        System.out.print(visited2[i]+" ");
        }
        System.out.println(visited2[visited2.length-1]);
    }
    public static int[][] doublesort(int[][]a) {//二次元配列のソート
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        return a;
    }
    static long modpow(long x,long n,long mo) {//x^n%mo
        long sum=1;
        while(n>0) {
            if((n&1)==1) {
                sum=sum*x%mo;
            }
            x=x*x%mo;
            n>>=1;
        }
        return sum;
    }
    public char[] revch(char ch[]) {//char[]を逆にする
		char ret[]=new char[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
    public int[] revint(int ch[]) {//int[]を逆にする
		int ret[]=new int[ch.length];
		for(int i=ch.length-1,j=0;i>=0;i--,j++) {
			ret[j]=ch[i];
		}
		return ret;
	}
    public static long int_mod(long a,long m) {
    	long b=m,u=1,v=0;
    	while(b>0) {
    		long t=a/b;
    		a-=t*b;long hoge=a;a=b;b=hoge;
    		u-=t*v;hoge=u;u=v;v=hoge;
    	}
    	u%=m;
    	if(u<0)u+=m;
    	return u;
    }
	public static void main(String[] args) {
		int mod=1000000007;
		int a=scan.nextInt();
		int b=scan.nextInt();
		int one=0;
		int two=0;
		while(a>=3&&b>=3) {
			one++;
			two++;
			a-=3;
			b-=3;
		}
		long cost=1;
		if(!(a==1&&b==2||a==2&&b==1||a==0&&b==0)) {
			System.out.println(0);
			return;
		}
		if(a==1) {
			one++;
		}
		else if(b==1){
			two++;
		}
		for(int i=1;i<=one+two;i++) {
			cost*=i;
			cost%=mod;
		}
		for(long i=1;i<=one;i++) {
			long uo=int_mod(i,mod)%mod;
			cost*=uo;
			cost%=mod;
		}
		for(long i=1;i<=two;i++) {
			long uo=int_mod(i,mod)%mod;
			cost*=uo;
			cost%=mod;
		}
		System.out.println(cost);
	}
}