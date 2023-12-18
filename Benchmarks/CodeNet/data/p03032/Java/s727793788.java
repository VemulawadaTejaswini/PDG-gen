import sun.awt.image.ImageWatched;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    public static void main(String args[]) throws IOException{
        Reader in = new Reader();
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> lambMs = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lambMs.add(in.nextInt());
        }
        int max = 0;

        for (int a = 0; a < k + 1; a++){
            if (a != 0) {
                int index = Collections.binarySearch(temp1, lambMs.get(a - 1));
                if (index < 0)
                    index = Math.abs(index + 1);
                temp1.add(index, lambMs.get(a - 1));
            }
            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.addAll(temp1);
            for (int b = 0; b < k - a + 1; b++){
                if (b != 0) {
                    int index2 = Collections.binarySearch(temp2, lambMs.get(lambMs.size() - b));
                    if (index2 < 0)
                        index2 = Math.abs(index2 + 1);
                    temp2.add(index2, lambMs.get(lambMs.size() - b));
                }
                ArrayList<Integer> temp3 = new ArrayList<>();
                temp3.addAll(temp2);
                for (int c = 0; c < Math.min(k - a - b, temp2.size()) + 1; c++){
                    System.out.println(temp3 + " " + a + " "  + b);
                    int sum = 0;
                    if (c != 0) {
                        temp3.remove(0);
                    }
                    for (int i = 0; i < temp3.size(); i++){
                        sum += temp3.get(i);
                    }
                    max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }
}
