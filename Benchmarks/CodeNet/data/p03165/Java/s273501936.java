
// LM10: The next Ballon d'Or
import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.Math.*;
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
        public void scanLongArr(long [] arr){for (int i=0;i<arr.length;++i){arr[i]=l();}}
        public void shuffle(int [] arr){ for(int i=arr.length;i>0;--i) { int r=(int)(Math.random()*i); int temp=arr[i-1]; arr[i-1]=arr[r]; arr[r]=temp; } }
    }
    public static void main(String[] args)throws IOException {
        /*
Sample Input 1
Copy
axyb
abyxb
Sample Output 1
Copy
axb
        */
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int t=1;
        for(int ti=0;ti<t;++ti)
        {
            char [] str1=fr.nextLine().toCharArray();
            char [] str2=fr.nextLine().toCharArray();
            int [][] dp=new int[str1.length+1][str2.length+1];
            for(int ni=0;ni<=str1.length;++ni)
            {
                for(int mi=0;mi<=str2.length;++mi)
                {
                    if(ni==0 || mi==0)
                    {
                        dp[ni][mi]=0;
                        continue;
                    }
                    if(str1[ni-1]==str2[mi-1])
                    {
                        dp[ni][mi]=dp[ni-1][mi-1]+1;
                    }
                    else
                    {
                        dp[ni][mi]=Math.max(dp[ni][mi-1],dp[ni-1][mi]);
                    }
                }
            }
            char [] ans=new char[dp[str1.length][str2.length]];
            int index=ans.length-1;
            int curX=str1.length;
            int curY=str2.length;
            int length=ans.length;
            while(index>=0) {
               // pw.println("New loop length="+length);
                while (dp[curX][curY - 1] == length)
                {
                    --curY;
                   // pw.println("curY="+curY);
                }
                while (dp[curX - 1][curY] == length)
                {
                    --curX;
                    //pw.println("curX="+curX);
                }
                if (dp[curX][curY] == length && dp[curX][curY -1] == length - 1 && dp[curX-1][curY - 1] == length - 1 && dp[curX - 1][curY] == length - 1)
                {
                    //pw.println(curX + " " + curY);
                    ans[index] = str1[curX-1];
                    --length;
                    --curY;
                    --index;
                    --curX;
                }
            }
            pw.println(String.valueOf(ans));
        }
        pw.flush();
        pw.close();
    }
}