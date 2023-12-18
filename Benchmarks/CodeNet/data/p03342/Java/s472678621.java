import java.util.*;
import java.io.*;
import java.math.*;
class Main
{
    static class Reader 
    { 
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;} 
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];} 
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;} 
        public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();} 
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;} 
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;} 
        public double d() throws IOException {return Double.parseDouble(s()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; } 
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; } 
    } 
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    //    RRRRRRRRR            AAA             HHH     HHH     IIIIIIIIIIIII   LLL           //
    //    RR    RRR           AAAAA            HHH     HHH      IIIIIIIIIII    LLL           //
    //    RR   RRR           AAAAAAA           HHH     HHH          III        LLL           //
    //    RR  RRR           AAA   AAA          HHHHHHHHHHH          III        LLL           //
    //    RRRRRR           AAA     AAA         HHHHHHHHHHH          III        LLL           //
    //    RR  RRR         AAAAAAAAAAAAA        HHH     HHH          III        LLL           //
    //    RR    RRR      AAA         AAA       HHH     HHH      IIIIIIIIIII    LLLLLLLLLLLL  //
    //    RR     RRR    AAA           AAA      HHH     HHH     IIIIIIIIIIIII   LLLLLLLLLLLL  //
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        int n=sc.i();
        int arr[]=new int[n];
        long sum[]=new long[n+2];
        long  xor[]=new long[n+2];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.i();
            sum[i+1]+=(long)sum[i]+arr[i];
            xor[i+1]=(long)xor[i]^arr[i];
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int low1=i+1;
            int high1=n;
            while(low1<high1)
            {
                int mid=(low1+high1+1)/2;
                if(sum[mid]-sum[i]>=(xor[mid]^xor[i]))
                high1=mid-1;
                else
                low1=mid;
            }
            int low2=i+1;
            int high2=n;
            while(low2<high2)
            {
                int mid=(low2+high2+1)/2;
                if(sum[mid]-sum[i]>(xor[mid]^xor[i]))
                high2=mid-1;
                else
                low2=mid;
            }
            ans+=low2-low1+1;
        }
        System.out.println(ans);
    } 
}