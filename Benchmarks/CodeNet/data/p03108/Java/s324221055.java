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
    static int arr[];
    static int size[];
    static int n;
    static long subfac=0;
    static void initialize()
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
            size[i]=1;
        }
    }
    static void union(int A,int B)
    {
        int root_A = root(A);
        int root_B = root(B);
        if(arr[root_A]==arr[root_B])
        return;
        subfac-=(long)size[root_A]*(size[root_A]-1)/2;
        subfac-=(long)size[root_B]*(size[root_B]-1)/2;
        subfac+=((long)size[root_B]+(long)size[root_A])*(size[root_B]+size[root_A]-1)/2;
        if(size[root_A] < size[root_B])
        {
            arr[root_A] = arr[root_B];
            size[root_B] += size[root_A];
        }
        else
        {
            arr[root_B] = arr[root_A];
            size[root_A] += size[root_B];
        }
    }
    static int root(int i)
    {
        while(arr[i]!= i)
        {
            arr[i]=arr[arr[i]]; 
            i=arr[i];
        }
        return i;
    }    
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        n=sc.i();int m=sc.i();
        int store[][]=new int[m][2];
        arr=new int[n];size=new int[n];
        initialize();
        for(int i=0;i<m;i++)
        store[i]=sc.arr(2);
        long ans=(long)n*(n-1)/2;
        long anss[]=new long[m];
        anss[m-1]=ans;
        for(int i=m-1;i>=1;i--)
        {
            union(store[i][0]-1,store[i][1]-1);
            anss[i-1]=ans-subfac;
        }
        for(long i:anss)out.println(i);
        out.flush();
    }
}