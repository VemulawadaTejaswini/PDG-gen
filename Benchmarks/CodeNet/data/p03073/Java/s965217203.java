import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		String S=next();
		int N=S.length();
		int one=0,two=0;
		for(int i=0;i<N;i+=2){
			if(S.charAt(i)=='1')
				one++;
			if(i+1<N&&S.charAt(i+1)=='0')
				one++;
		}
		for(int i=0;i<N;i+=2){
			if(S.charAt(i)=='0')
				two++;
			if(i+1<N&&S.charAt(i+1)=='1')
				two++;
		}
		System.out.println(Math.min(two,one));
	}
	static boolean isOK(int index,String key,String[]a){
		if (a[index].compareTo(key)>=0) return true;
	    else return false;
	}
	static int binary_search(String key,String[] a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.length; // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
	    while (Math.abs(ok - ng) > 1) {
	        int mid = (ok + ng) / 2;
	        if (isOK(mid,key,a)) ok = mid;
	        else ng = mid;
	    }
	    return ok;
	}
	//FastScanner
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextInts (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
		if (!hasNext()) throw new NoSuchElementException();
		boolean minus = false;
		int temp = readByte();
		if (temp == '-') {
			minus = true;
			temp = readByte();
		}
		if (temp<'0' || '9'<temp) throw new NumberFormatException();
		long n = 0;
		while (isPrintable(temp)) {
			if ('0'<=temp && temp<='9') {
				n *= 10;
				n += temp - '0';
			}
			temp = readByte();
		}
		return minus? -n : n;
	}
}

