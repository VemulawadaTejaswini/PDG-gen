import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
    static class CstctnT{
        int st, et, loc;
        public CstctnT(int startTime, int endTime, int Loc){
            st = startTime;
            et = endTime;
            loc = Loc;
        }
    }
    public static void main(String args[]) throws IOException{
        Reader in = new Reader();
        int n = in.nextInt();
        int q = in.nextInt();
        ArrayList<CstctnT> CstctnTs = new ArrayList<>();
        int[] walkedDist = new int[q];
        int[] stPos = new int[q];
        Arrays.fill(walkedDist, -1);
        for (int i = 0; i < n; i++){
            CstctnTs.add(new CstctnT(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        CstctnTs.sort(new Comparator<CstctnT>() {
            @Override
            public int compare(CstctnT o1, CstctnT o2) {
                return o1.loc == o2.loc ? 0 : o1.loc > o2.loc ? 1 : -1;
            }
        });
        for (int i = 0; i < q; i++){
            stPos[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            CstctnT temp = CstctnTs.get(i);
            int mst = temp.st - temp.loc;
            int met = temp.et - temp.loc;
            int sindex = Arrays.binarySearch(stPos, mst);
            int eindex = Arrays.binarySearch(stPos, met);
            if (sindex < 0)
                sindex = Math.abs(sindex + 1);
            if (eindex < 0)
                eindex = Math.abs(eindex + 1);
            for (int j = Math.max(0, sindex); j < eindex; j++){
                if (walkedDist[j] == -1)
                    walkedDist[j] = temp.loc;
            }
        }
        for (int i = 0; i < q - 1; i++){
            System.out.println(walkedDist[i]);
        }
        System.out.print(walkedDist[q - 1]);
    }
}
