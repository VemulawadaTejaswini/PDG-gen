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

    static class pair 
    {
       int x;
       int y;
       public pair (int k, int p) 
       {
           x = k;
           y = p;
       }
       @Override
       public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pair pair = (pair) o;
            return x == pair.x && y == pair.y;
        }
    
       @Override
       public int hashCode() {
            return Objects.hash(x, y);
       }
    }
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        String s=sc.s();
        int n=s.length();
        int arr[]=new int[s.length()+1];
        for(int i=1;i<=n;i++)
        arr[i]=s.charAt(i-1)-48;
        int check=0;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==1&&arr[n-i]!=1)
            {
                check=1;
                break;
            }
        }
        if(check==1||arr[1]==0||arr[n-1]==0)
        {
            System.out.println(-1);
            System.exit(0);
        }
        ArrayList<pair> al=new ArrayList<>();
        al.add(new pair(1,2));
        int curr=1;
        int counter=2;
        for(int i=2;i<=n-1;i++)
        {
            if(arr[i]==1)
            {
                al.add(new pair(curr,++counter));
                curr=counter;
            }
            else
            {
                al.add(new pair(curr,++counter));
            }
        }
        for(pair p:al)
        out.println(p.x+" "+p.y);
        out.flush();
    }
}