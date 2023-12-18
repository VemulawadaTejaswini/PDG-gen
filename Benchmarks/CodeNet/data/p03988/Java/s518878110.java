import java.io.BufferedWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Random;
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

        }


        }

    /**
     * @param args
     */

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
      

void  solve() throws IOException{
	/*
	 *  niceo problem! (me giapwneziki profora :P)
	 *   stnw to dentro basi tis diametrou tis
	 *   an einai valid tree iparxoun  (toul) dio komboi me megisto distance
	 *   thetw san root akribws to/ta center tou graph analogws an i apostasi einai peritti i oxi:
	 *   ksekinaw apo katw pros ta panw
	 *   oso den ftanw sto/sta center:
	 *   prepei na iparxei akoloutia kombwn   max,max-1,......d(center)-1 i opoia ehei toulaxiston
	 *   dio kombous (enas sindeetai me tin aristeri kai eans me tin deksia pleura). Oi extra emfaniseis 
	 *   karfitswnontai stin deksia alisida
	 *   paradeigma:
	 *   
	 *       c
	 *    b   (x q l w)
	 *  a      (y d e f)
	 *  ena kentro epeidi i apostasi einai  artia
	 *  iparxie akolouthia  4,3 me >2 kai extra apostasi enos kentrou
	 *  ---
	 *  O(n) 
	 */
		int n=in.readInt();
		int[] A=new int[100];
		int max=-1;
		for (int i=0;i<n;++i){
			int x=in.readInt();
			max=Math.max(x,max);
			A[x]++;
		}
		boolean sol=true;
		int limit=-1;
		int c=-1;
		if (max%2==0){
			c=1;
			limit=max/2;
		}else{
			c=2;
			limit=(max-1)/2 +1;
		} int met=0;
		for (int i=max;i>=limit;--i){
			if (i==limit){
				if (A[i]!=c){
					sol=false;
					break;
				}
			}else{
				if (A[i]<2) {
					sol=false; 
					break;
				}
			}
			met+=A[i];
		}
		if (met<n) sol=false;
		if (!sol) out.print("Impossible");
		else out.printLine("Possible");
}        
}