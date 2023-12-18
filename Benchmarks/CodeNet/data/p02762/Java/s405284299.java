import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main{

    static int bfs(int src,LinkedList<Integer>[] friend,LinkedList<Integer>[] enemy){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(src);
        int count=0;
        int j=0;
        while (!queue.isEmpty()){

            int temp = queue.poll();

            for(Integer i:friend[temp]){
                if(!hashSet.contains(i) && !enemy[temp].contains(i)) {
                    queue.add(i);
                    hashSet.add(i);
                    if(!enemy[src].contains(i) && j>0){
                        count++;
                    }
                }
            }
            j++;
        }
            return count;
    }

    public static void main(String[] args) throws IOException {

        int n,m,k;
        Reader scanner=new Reader();
        n=scanner.nextInt();
        m=scanner.nextInt();
        k=scanner.nextInt();
        LinkedList<Integer>[] friends=new LinkedList[n+1];
        LinkedList<Integer>[] enemy=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            friends[j]=new LinkedList<>();
            enemy[j]=new LinkedList<>();
        }
        for(int j=0;j<m;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            friends[a].add(b);
            friends[b].add(a);
        }
        for(int j=0;j<k;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            enemy[a].add(b);
            enemy[b].add(a);
        }
//        int[] ans=new int[n];
        for(int j=0;j<n;j++){
            System.out.print(bfs(j+1,friends,enemy)+" ");

        }


    }

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
}
