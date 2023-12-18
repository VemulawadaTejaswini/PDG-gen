import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static void s(String s){
        System.out.print(s);
    }
    private static void s(Double s){
        System.out.print(s);
    }
    private static void s(char s){
        System.out.print(s);
    }
    private static void sn(String s){
        System.out.println(s);
    }
    private static void sn(long s){
        System.out.println(s);
    }
    private static void sn(Double s){
        System.out.println(s);
    }
    private static void sn(String s, Object o){
        sb.append(s+"\n");
    }
    private static void sn(long s, Object o){
        sb.append(s+"\n");
    }
    private static void sn(boolean s, Object o){
        sb.append(s+"\n");
    }
    private static void pr(){
        System.out.print(sb);
    }
    static class Reader{
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
    private static boolean isPrime(Integer ii){
        return new BigInteger(ii+"").isProbablePrime(1);
    }
    private static boolean isDigit(int ii){
        return Character.isDigit((char)ii);
    }
    static boolean prime[] = new boolean[100008];
    static int prr[] = new int[100008];
    static{
        Arrays.fill(prime, true);
        for(int p = 2; p*p <=100006; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= 100006; i += p)
                    prime[i] = false;
            }
        }
        int nc = 0;
        for(int p = 2; p <=100006; p++)
        {
            if(prime[p] == true && prime[(p+1)/2] == true)
            {
                prr[p]+=nc+1;
                nc = prr[p];
            }
        }
    }
	public static void main (String[] args) throws Exception{
        Reader r = new Reader();
        int q= r.nextInt();
        int arr[][] = new int[q-1][3];
        for(int i=0;i<q-1;i++){
            arr[i][0] = r.nextInt();
            arr[i][1] = r.nextInt();
            arr[i][2] = r.nextInt();
        }
        for(int i=0;i<q-1;i++){
            int time = arr[i][1] + arr[i][0];
            for(int ii=i+1;ii<q-1;ii++){
                if(time<arr[ii][1]){
                    time = arr[ii][1];
                }
                while(time%arr[ii][2]!=0){
                    time++;
                }
                time+=arr[ii][0];
            }
            sn(time, null);
        }
        sn(0, null);
        pr();
	}
}