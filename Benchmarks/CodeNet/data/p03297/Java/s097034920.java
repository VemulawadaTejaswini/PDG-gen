import java.util.*;
import java.io.*;
class Main
{
    static class InputReader {
        private InputStream stream;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0;
        private int ptrbuf = 0;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int readByte() {
            if (lenbuf == -1) throw new UnknownError();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = stream.read(inbuf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
    }
    public static void main(String args[])
    {
        InputReader sc=new InputReader(System.in);
        int n;long a,b,c,d;
        n=sc.nextInt();
        while(n>0)
        {
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            d=sc.nextLong();
            Map<Long,Integer> m=new HashMap<>();
            int f=0;
            if(a<b)
                System.out.println("No");
            else
            {
                f=0;
                while(true)
                {
                    long temp=a%b;
                    if(m.containsKey(temp))
                    {
                        f=1;
                        break;
                    }
                    else
                    {
                        m.put(temp,1);
                        if(temp>c && temp<b)
                            break;
                        a=d+temp;
                    }
                }
                if(f==0)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
            n--;
        }
    }
}