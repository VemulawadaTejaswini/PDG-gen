import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/* abhi2601 */

public class Main implements Runnable{

    final static long mod = (long)1e9 + 7;

    class Pair{
        int l,r;
        Pair(int l,int r){
            this.l=l;
            this.r=r;
        }
    }
    class Comp implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            if(p1.l<p2.l) return -1;
            else if(p1.l>p2.l) return 1;
            else{
                if(p1.r<p2.r) return -1;
                else if(p1.r>p2.r) return 1;
                else return 0;
            }
        }
    }
    public void run(){
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0') sb.append('1');
            else sb.append('0');
        }
        String s1=sb.toString();
        int k1=k-1;
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q1=new LinkedList<>();
        int c=0,t=0,ans=0,p=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                c++;
                if(c==1){
                    if(t>k){
                        p=q.poll();
                        t--;
                    }
                    ans=Math.max(ans,i-p-1);
                }
            }
            else{
                if(c!=0){
                    t++;
                    q.add(i-1);
                    c=0;
                }
                if(i==n-1){
                    if(t>k){
                        p=q.poll();
                        t--;
                    }
                    ans=Math.max(ans,i-p);
                }
            }
        }
        int c1=0,t1=0,ans1=0,p1=-1;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)=='0'){
                c1++;
                if(c1==1){
                    if(t1>k1){
                        p1=q1.poll();
                        t1--;
                    }
                    ans1=Math.max(ans1,i-p1-1);
                }
            }
            else{
                if(c1!=0){
                    t1++;
                    q1.add(i-1);
                    c1=0;
                }
                if(i==n-1){
                    if(t1>k1){
                        p1=q1.poll();
                        t1--;
                    }
                    ans1=Math.max(ans1,i-p1);
                }
            }
        }
        w.println(Math.max(ans,ans1));
        w.close();
    }
    //static PrintWriter w;
    /*File in=new File("input.txt");
        File out=new File("output.txt");
        Scanner sc= null;
        try {
            sc = new Scanner(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            w=new PrintWriter(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine()
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt()
        {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-')
            {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do
            {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.')
            {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.')
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return readString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception
    {
        new Thread(null, new Main(),"q1",1<<26).start();
    }
}