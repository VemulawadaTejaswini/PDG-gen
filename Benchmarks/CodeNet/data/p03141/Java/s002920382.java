import java.util.*;
import java.io.*;
import java.math.*;
public class Main
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
        public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = i();}return ret;}
    }
    
    
 
           //       |----|       /\      |    |   -----   |
           //       |   /       /  \     |    |     |     |
           //       |--/       /----\    |----|     |     |
           //       |   \     /      \   |    |     |     |
           //       |    \   /        \  |    |   -----   -------
    static class B1 implements Comparable<B1>
    {
        int x;int y;int index;
        public B1(int a,int b,int c) 
        {
            x=a;
            y=b;
            index =c;
        }
        public int compareTo(B1 num) 
        {
            if(x-y-(num.x-num.y)==0)
            return num.x-x;
            return x-y-(num.x-num.y);
        }
    }
    static class B implements Comparable<B>
    {
        int x;int y;int index;
        public B(int a,int b,int c) 
        {
            x=a;
            y=b;
            index =c;
        }
        public int compareTo(B num) 
        {
            if(y-x-(num.y-num.x)==0)
            return num.y-y;
            return x-y-(num.x-num.y);
        }
    }
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        int n=sc.i();
        B1 arr[]=new B1[n];
        B brr[]=new B[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new B1(sc.i(),sc.i(),i);
            brr[i]=new B(arr[i].x,arr[i].y,i);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        int c=0;
        long ans=0;
        int i=0,j=0;
        int mark[]=new int[n];
        int count=0;
        while(count!=n)
        {
            if(c==0)
            {
                while(mark[arr[i].index]!=0)
                i++;
                mark[arr[i].index]=1;
                ans+=(long)arr[i].x;
                i++;
            }
            else
            {
                while(mark[brr[j].index]!=0)
                j++;
                mark[brr[j].index]=1;
                ans-=(long)brr[j].y;
                j++;
            }
            count++;
            c^=1;
        }
        out.println(ans);
        out.flush();
    }
}