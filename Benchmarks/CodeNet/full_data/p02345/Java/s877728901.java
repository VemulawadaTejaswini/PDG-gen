import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	static int[] rmq;
	static int n;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		n = sc.nextInt();
		int q = sc.nextInt();
		int[] com = new int[q];
		int[] x = new int[q];
		int[] y = new int[q];
		rmq = new int[n<<1];
		for (int i=0; i<n<<1; i++) {
			rmq[i] = Integer.MAX_VALUE;
		}

		for (int i=0; i<q; i++) {
			com[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		for (int i=0; i<q; i++) {
			if (com[i] == 0) {
				update(x[i], y[i]);
			} else {
				find(x[i], y[i]);
			}
		}

	}

	static void update(int x, int y) {
		rmq[x+n] = y;
		for (int i=x+n; i>1; i>>=1) {
			rmq[i>>1] = Math.min(rmq[i], rmq[i^1]);
		}
	}

	static void find(int x, int y) {
		int ret = Integer.MAX_VALUE;
		for (int i=x+n, j=y+n; i<=j; i=(i+1)>>1, j=(j-1)>>1) {
			if ((i&1)==1) {
				ret = Math.min(ret, rmq[i]);
			}
			if ((j&1)==0) {
				ret = Math.min(ret, rmq[j]);
			}
		}
		System.out.println(ret);
	}
}

class FastScanner {
private final InputStream in = System.in;
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
private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
if (!hasNext()) throw new NoSuchElementException();
int n = 0;
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
}