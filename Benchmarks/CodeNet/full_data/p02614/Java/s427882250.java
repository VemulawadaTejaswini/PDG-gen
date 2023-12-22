import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class Main {
public interface SpaceCharFilter {
public boolean isSpaceChar(int ch);
}

class InputReader {
private InputStream stream;
private byte[] buf = new byte[1024];
private int curChar;
private int numChars;
private SpaceCharFilter filter;
public InputReader(InputStream stream) {
this.stream = stream;
}
public int read() {
if (numChars == -1)
throw new InputMismatchException();
if (curChar >= numChars) {
curChar = 0;
try {

numChars = stream.read(buf);

} catch (IOException e) {

throw new InputMismatchException();

}

if (numChars <= 0)

return -1;

}

return buf[curChar++];

}
public int readInt() {

int c = read();

while (isSpaceChar(c))

c = read();

int sgn = 1;

if (c == '-') {

sgn = -1;

c = read();

}

int res = 0;

do {

if (c < '0' || c > '9')

throw new InputMismatchException();

res *= 10;

res += c - '0';

c = read();

} while (!isSpaceChar(c));

return res * sgn;

}


public long readLong() {

int c = read();

while (isSpaceChar(c))

c = read();

int sgn = 1;

if (c == '-') {

sgn = -1;

c = read();

}
long res = 0;
do {

if (c < '0' || c > '9')

throw new InputMismatchException();

res *= 10;

res += c - '0';

c = read();

} while (!isSpaceChar(c));

return res * sgn;

}
public String readString() {

int c = read();

while (isSpaceChar(c))
c = read();
StringBuilder res = new StringBuilder();
do {

res.appendCodePoint(c);
c = read();
} while (!isSpaceChar(c));
return res.toString();
}
public boolean isSpaceChar(int c) {

if (filter != null)

return filter.isSpaceChar(c);

return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
}
public String next() {
return readString();
}
}
class OutputWriter {
private final PrintWriter writer;
public OutputWriter(OutputStream outputStream) {
writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
}
public OutputWriter(Writer writer) {
this.writer = new PrintWriter(writer);
}
public void print(Object...objects) {
for (int i = 0; i < objects.length; i++) {
if (i != 0)
writer.print(' ');
writer.print(objects[i]);
}
}
public void printLine(Object...objects) {
print(objects);
writer.println();
}
public void close() {
writer.close();
}
public void flush() {
writer.flush();
}}
InputReader in= new InputReader(System.in);
OutputWriter out = new OutputWriter(System.out);
StringTokenizer tok;
public static void main(String[] args) throws IOException
{
   new Main().run();
}

void run() throws IOException
{  
   solve();
   out.flush();
   tok=null;
}


void solve()  throws IOException{
	int h=in.readInt();
	int w=in.readInt();
	int k=in.readInt();
	int numblack=0;
	boolean[][] black=new boolean[h][w];
	int[] roundh=new int[h];
	int[] roundw=new int[w];
	for (int i=0;i<h;++i) {
		String s=in.readString();
		for (int j=0;j<w;++j) {
			if (s.charAt(j)=='#') {
				black[i][j]=true;
				numblack++;
			}else
				black[i][j]=false;
		}
	}
	int ans=0;
	int rh=0;
	int rw=0;
	int nh=(int)Math.pow(2, h);
	int nw=(int)Math.pow(2, w);
	for (int ih=0;ih<nh;++ih) {
		rh++;
		int x=ih;
		int curr=h-1;
		while (x!=0) {
			int d= x % 2;
			if (d==1) {
				roundh[curr]=rh;
			}
			x/=2;
			curr--;
		}
		int leftblack=numblack;
		for (int i=0;i<h;++i) {
			if (roundh[i]==rh) {
				for (int j=0;j<w;++j) {
					if (black[i][j]) {
						leftblack--;
					}
				}
			}
		}
		for (int iw=0;iw<nw;++iw) {
			rw++;
			 x=iw;
			curr=w-1;
			while (x!=0) {
				int d= x % 2;
				if (d==1) {
					roundw[curr]=rw;
				}
				x/=2;
				curr--;
			}
			int leftblack2=leftblack;
			for (int i=0;i<h;++i) {
				if (roundh[i]!=rh) {
					for (int j=0;j<w;++j) {
						if (black[i][j] && roundw[j]==rw) {
							leftblack2--;
						}
					}
				}
			}
			if (leftblack2==k) {
				ans++;
			}
		}
	}
	out.printLine(ans);
	
}

}