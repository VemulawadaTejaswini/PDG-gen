import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.*;
import java.util.StringTokenizer; 


/*
* Problem : abc - 160 E
* Acknowledgement : None
* Author : deathnaught_
* GitHub : www.github.com/DeathNaughT-GitHub
* Complexity : O()
*/

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Reader sc = new Reader();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int p[] = sc.nextArray(A);
        int q[] = sc.nextArray(B);
        int r[] = sc.nextArray(C);
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        long sum = 0;
        int in = A - X, jn = B - Y, cn = C - 1;
        while (cn >= 0) {
            if (in < A && jn < B) {
                //System.out.println(in + ", " + jn +", " + cn);
                if (r[cn] > p[in] && p[in] <= q[jn]) {
                    p[in] = r[cn];
                    in++;
                    cn--;
                }
                else if (r[cn] > q[jn] && q[jn] <= p[in]) {
                    q[jn] = r[cn];
                    jn++;
                    cn--;
                }
                else if (r[cn] <= p[in] && r[cn] <= q[jn]) {
                    break;
                }
            }
            else if (in < A && jn >= B) {
                if (cn >= 0 && in < A && r[cn] > p[in]) {
                    p[in] = r[cn];
                    cn--;
                    in++;
                }
            }
            else if (jn < B && in >= A) {
                if (cn >= 0 && jn < B && r[cn] > q[jn]) {
                    q[jn] = r[cn];
                    cn--;
                    jn++;
                }
            }
            else 
            break;
        }

        for (int i = A - X; i < A; i++) {
            sum += p[i];
        }

        for (int j = B - Y; j < B; j++) {
            sum += q[j];
        }

        System.out.println(sum);
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

        public int[] nextArray(int N) throws IOException
        {
            int ar[] = new int[N];
            for (int i = 0; i < N; i++) {
                ar[i] = nextInt();
            }
            return ar;
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