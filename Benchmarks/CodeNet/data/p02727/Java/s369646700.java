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
    
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//bw.write("Shubham Pandey\n");
        
        BI in=new BI();
        int x = in.nextInt();
        int y = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] red = new int[a];
        int[] gre = new int[b];
        int[] col = new int[c];
        for(int i=0;i<a;i++) red[i] = in.nextInt();
        for(int i=0;i<b;i++) gre[i] = in.nextInt();
        for(int i=0;i<c;i++) col[i] = in.nextInt();
        int pta = a-1;
        int ptb = b-1;
        int ptc = c-1;
        long sum=0L;
        Arrays.sort(red);
        Arrays.sort(gre);
        Arrays.sort(col);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<x;i++){
            lst.add(red[a-1-i]);
        }
        for(int i=0;i<y;i++){
            lst.add(gre[b-1-i]);
        }
        Collections.sort(lst);
        int pt = x+y-1;
        int pt2=c-1;
        for(int i=0;i<x+y;i++){
            if(pt2>=0 && col[pt2]>lst.get(pt)) {sum+=col[pt2];--pt2;}
            else {sum+=lst.get(pt);--pt;}
        }
        System.out.println(sum);
        bw.flush();
    }
}