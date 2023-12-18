import java.io.*;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.HashMap;
import java.util.PriorityQueue;
public class Main implements Runnable {
    static class pair implements Comparable
    {
        int f,s;
        pair(int fi,int se)
        {
            f=fi;
            s=se;
        }
        public int compareTo(Object o)
        {
            pair pr=(pair)o;
            if(f>pr.f)
                return 1;
            else
                return -1;
        }
        public boolean equals(Object o)
        {
            pair ob=(pair)o;
            int ff;
            int ss;
            if(o!=null)
            {
                ff=ob.f;
                ss=ob.s;
                if((ff==this.f)&&(ss==this.s))
                    return true;
            }
            return false;
        }
        public int hashCode()
        {
            return (this.f+" "+this.s).hashCode();
        }
    }
    public class triplet implements Comparable
    {
        int f,s;
        int t;
        triplet(int f,int s,int t)
        {
            this.f=f;
            this.s=s;
            this.t=t;
        }
        public boolean equals(Object o)
        {
            triplet ob=(triplet)o;
            int ff,ss;
            int tt;
            if(o!=null)
            {
                ff=ob.f;
                ss=ob.s;
                tt=ob.t;
                if((ff==this.f)&&(ss==this.s)&&(tt==this.t))
                    return true;
            }
            return false;
        }
        public int hashCode()
        {
            return (this.f+" "+this.s+" "+this.t).hashCode();
        }
        public int compareTo(Object o)
        {
            triplet tr=(triplet)o;
            if(f>tr.f)
                return 1;
            else if(f==tr.f)
            {
                if(s>tr.s)
                    return -1;
                else
                    return 1;
            }
            else
                return -1;
        }
    }
  	static int n,k,min=200000;
    static int m[],grundy[];
    static int mex(BitSet bs)
    {
        int k=0;
        while(bs.get(k))
            k++;
        return k;
    }
    static int solve(int x)
    {
        if(x<min)
            return 0;
        if(grundy[x]!=-1)
            return grundy[x];
        BitSet bs=new BitSet(105);
        for(int i=1;i<=n;i++)
        {
            if(m[i]<=x)
            {
                int kk=solve(x-m[i]);
                if(kk<=102)
                    bs.set(kk);
            }
        }
        int y=mex(bs);
        return y;
    }
    public static void main(String args[])throws Exception
    {
        new Thread(null,new Main(),"Main",1<<27).start();
    }
    public void run()
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            k=in.ni();
            m=new int[n+1];
            grundy=new int[k+1];
            Arrays.fill(grundy,-1);
            for(int i=1;i<=n;i++)
            {
                m[i] = in.ni();
                min=Math.min(min,m[i]);
            }
            int kk=solve(k);
            //for(int i=1;i<=k;i++)
              //  out.println(i+" "+grundy[i]);
            if(kk==0)
                out.println("Second");
            else
                out.println("First");
            out.close();
        }
        catch(Exception e){
            return;
        }
    }
    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int ni() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }
}