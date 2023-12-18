import java.util.*;
import  java.io.*;
public class Main{

    // public static int solute(int []arr, int n, int i, int j , int tot, boolean flg, int [][]ans){
        
    // }
  
  
  public static void main(String []args) throws Exception{
    Reader obj = new Reader();
    int n = obj.nextInt();
    ArrayList<Long> al = new ArrayList<Long>();
    for(int i = 0 ; i < n ; i++){
        al.add(obj.nextLong());
    }
    long cost = 0 ;
    int tempIndex ;
    long min , tempSum, temp , last ;
    while(al.size() > 1) {
        tempIndex = 0 ; 
        tempSum = 0 ;
        min = Integer.MAX_VALUE ;
        last = al.get(0); 
        for(int i = 1 ; i < al.size() ; i++){
            tempSum = last + al.get(i) ; 
            if(tempSum < min){
                min = tempSum ; 
                tempIndex = i - 1;
            }
            last = al.get(i) ;
        }
        temp = al.get(tempIndex) + al.get(tempIndex + 1) ;
        al.remove(tempIndex) ;
        al.remove(tempIndex);
        al.add(tempIndex, temp);
        cost += temp ;
    }
    System.out.println(cost) ; 
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
