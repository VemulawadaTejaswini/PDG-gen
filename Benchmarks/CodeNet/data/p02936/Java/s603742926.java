package root.h;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class Main {
    static FastScanner in;
    static PrintWriter out;
    static int N;
    static int Q;
    static LinkedList<Integer>[] v;
    static int[] ans;
    static int[] parent;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        in = new FastScanner(inputStream);
        out = new PrintWriter(outputStream);
        solve();
        out.flush();
    }

    static void solve() {
        N=in.nextInt();
        Q=in.nextInt();
        v=new LinkedList[N+1];
        ans=new int[N+1];
        parent=new int[N+1];
        for(int i=1;i<=N;i++) {
            v[i]=new LinkedList<Integer>();
        }
        for(int i=1;i<=N-1;i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            v[a].add(b);
            parent[b]=a;

        }

        for(int i=0;i<Q;i++) {
            int p=in.nextInt();
            int q=in.nextInt();
            ans[p]+=q;
        }


        for(int i=2;i<=N;i++) {

            int pi=parent[i];
//            System.err.println("i pi "+i+" "+pi);

            if(pi!=0) {ans[i]+=ans[pi];}

        }

        for(int i=1;i<=N;i++) {
            out.print(ans[i]+" ");
        }
        out.println();
    }


    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}
