import java.io.*;
import java.math.*;
import java.util.*;
public class Main
{
	static class FastReader
    {
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public FastReader() { this(System.in); }public FastReader(InputStream is) { mIs = is;}
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}
        public String next(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}
        public double d() throws IOException {return Double.parseDouble(next()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }
        public void scanIntArr(int [] arr){ for(int li=0;li<arr.length;++li){ arr[li]=i();}}
        public void scanIntIndexArr(int [] arr){ for(int li=0;li<arr.length;++li){ arr[li]=i()-1;}}
        public void scanLongArr(long [] arr){for (int i=0;i<arr.length;++i){arr[i]=l();}}
        public void shuffle(int [] arr){ for(int i=arr.length;i>0;--i) { int r=(int)(Math.random()*i); int temp=arr[i-1]; arr[i-1]=arr[r]; arr[r]=temp; } }
        public int swapIntegers(int a,int b){return a;} //Call it like this: a=swapIntegers(b,b=a)
    }
	public static void main(String args[]) throws IOException{
		FastReader in = new FastReader();
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder out = new StringBuilder();
		int k = in.i(), a= in.i(), b=in.i();
		int v = (a/k+1)*k;
		if(a%k==0 || b%k==0 || (v>a && v<b))
			out.append("OK");
		else
			out.append("NG");
		pw.print(out);
		pw.flush();
        pw.close();
	}
	private static class Pair<F, S> {
 
        public F first;
 
        public S second;
 
        public Pair() {}
 
        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
		public String toString(){
			return "("+first+", "+second+")";
		}
    }
 
    private static class Triple<F, S, T> {
 
        public F first;
 
        public S second;
 
        public T third;
 
        public Triple() {}
 
        public Triple(F first, S second, T third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
}
		// long k = in.i();
		// long lo = 0, hi = (long)100000;
		// while(lo<hi){
			// long mid = lo+(hi-lo)/2;
			// if((long)100*Math.pow(1.01,mid)>=k) hi=mid;
			// else lo = mid+1;
			// System.out.println(100*Math.pow(1.01,mid));
		// }