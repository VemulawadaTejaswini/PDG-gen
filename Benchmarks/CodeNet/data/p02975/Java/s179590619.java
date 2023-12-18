import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
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
void solve() throws IOException{
/*
 * assume such an ordering exists:
 * then let a be any trivial number in the circle and b,c its neighours
 *  then a ^ b ^ c =0
 *   then, consider b  it has neighbour   a b d.
 *   we need a ^ b ^ d =0 hence c==d  (likewise)
 *   so we need to have a triplet (a,b,c) repeated all the time 
 *  cases hence 
 *  - a=b=c  (only 0 is applicable since  a ^ a = 0 count{0}=n )
 *  - a!=b, a!=c (Standard case counts{a}=count{b}=count{c}=n/3)
 *  - a=b , a!=c (a ^ a =0, hence it must be (0,a) in ration count{a}=2count{0})
 *  - a!=b, a=c ...
 *  - a!=b, b=c ...
 */
int n=in.readInt();
		int[] uniques=new int[3];
		int[] counts=new int[3];
		int uc=0;
		int m_index=0;
		int ux=0;
		for (int i=0;i<3;++i) {
			counts[i]=0;
		}
		int pos=0;
		for (int i=0;i<n;++i) {
			int x=in.readInt();
			if (uc==0) {
				uniques[uc]=x;
				counts[uc++]=1;
				m_index=0;
				ux=x;
			}else {
				int j=0;
				for (j=0;j<uc;++j) {
					if (uniques[j]==x) {
						break;
					}
				}
				if (j<uc) {
					counts[j]++;
				}else {
					if (uc==3) {
						uc++;
						break;
					}else {
						counts[uc]=1;
						if (x<uniques[m_index]) {
							m_index=uc;
						}
						uniques[uc++]=x;
						ux=ux^x;
					}
				}
			}
		}
		if (uc<=3) {
			if (uc==1) {
				if (uniques[0]==0) pos=1;
			}else {
				if ( n  % 3 ==0) {
					if (uc==3) {
						if (ux==0 && counts[0]==counts[1] && counts[2]==counts[1]) {
							pos=1;
						}
					}else if (uc==2) {
						if (uniques[m_index]==0 && counts[m_index]==n/3) {
							pos=1;
						}
					}
				}
			}
		}
		if (pos==1) {
			out.printLine("YES");
		}else {
			out.printLine("NO");
		}
	}
}