import java.io.*;
import java.util.*;
public class Main{
    
    static class BI{
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream dis;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        
        //********Constructors*********\\
        
        public BI() {
            dis = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public BI(String file_name) throws IOException {
            dis = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        
        //*******Reads a line until new line character************\\
        
        public String readLine() throws IOException {
            byte[] buf = new byte[1<<25];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
        
        //*******Reads a string Until First Space************\\
        
        public String nextString() throws IOException {
            // Skip all whitespace characters from the stream
            byte c = read();
            while(Character.isWhitespace(c)){
                c = read();
            }
            StringBuilder builder = new StringBuilder();
            builder.append((char)c);
            c = read();
            while(!Character.isWhitespace(c)){
                builder.append((char)c);
                c = read();
            }
            return builder.toString();
        }
        
        //*******Reads a Integer************\\
        
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
        
        //*******Reads a Integer************\\
        
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
        
        //*******Reads a Char************\\
        
        public char nextChar() throws IOException{
            byte c = read();
            while(Character.isWhitespace(c)){
                c = read();
            }
            return (char) c;
        }
        
        //*******Reads a Double************\\
        
        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            if (neg)
			return -ret;
			return ret;
        }
        
        //*******Reads an array of double values************\\
        
        public double[] nextDoubleArray(int n) throws IOException {
            double arr[] = new double[n];
            for(int i = 0; i < n; i++){
                arr[i] = nextDouble();
            }
            return arr;
        }
        
        //*******Reads an array of long integers************\\
        
        public long[] nextLongArray(int n) throws IOException {
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        
        //*******Reads an array of Integers************\\
        
        public int[] nextIntArray(int n) throws IOException {
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        
        //*******Fills the buffer from input stream************\\
        
        private void fillBuffer() throws IOException {
            bytesRead = dis.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
            buffer[0] = -1;
        }
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
            fillBuffer();
            return buffer[bufferPointer++];
        }
        public void close() throws IOException {
            if (dis == null) return;
            dis.close();
        }
        
    }
    
    //**********************CODE IS HERE*****************************\\
    
    static long gcd(long a, long b){ return (b==0) ? a : gcd(b, a%b); }
    static int gcd(int a, int b){ return (b==0) ? a : gcd(b, a%b); }
    public static int rev(int a)
    {
        int tmp=0;
        while(a>0)
        {
            tmp = (tmp*10)+(a%10);
            a=a/10;
        }
        return tmp;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//bw.write("Shubham Pandey\n");
        BI in=new BI();
        
        int big = (int)1e7;
        String str = in.nextString();
        long k = in.nextLong();
        int n = str.length();
        if(n==1){ long tp = k/2; bw.write(tp+"");}
        else
        {
            char ch[] = str.toCharArray();
            long count=0l;
            if(ch[0]==ch[1]) {ch[0]='A';count++;}
            for(int i=0;i<n-1;i++)
            {
                if(ch[i]==ch[i+1]) {ch[i+1] = 'A';count++;}
            }
            if(k>1 && ch[0]==ch[n-1])
            {
                count++;
                bw.write(((count*k*1L)-1)+"");
            }
            else
            {
                bw.write(count*k*1L+"");
            }
        }
        bw.flush();
    }
}