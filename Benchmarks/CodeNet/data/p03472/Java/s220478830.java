import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
class CustomPair <K, V>{
    private K key;
    private V value;
    protected CustomPair (K key, V value) {
        this.key = key;
        this.value = value;
    }
    protected K getKey () {
        return key;
    }
    protected V getValue () {
        return value;
    }
}
class Main {

    static class Reader {
        private BufferedReader br;
        private StringTokenizer token;
        protected Reader(InputStream obj)
        {
            br = new BufferedReader(new InputStreamReader(obj));
            token = null;
        }
        protected String next()
        {
            while (token == null || !token.hasMoreElements())
            {
                try
                {
                    token = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return token.nextToken();
        }
        protected long[] nextLongArr(int n)
        {
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        protected int[] nextIntArr(int n)
        {
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        protected Integer[] nextIntegerArray(int n)
        {
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        protected Long[] nextLongArray(int n)
        {
            Long[] arr = new Long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        protected int[][] nextIntMap (int rows, int columns) {
            int[][] arr = new int[rows][columns];
            for (int i=0; i<rows; i++) {
                for (int j=0; j<columns; j++) {
                    arr[i][j] = nextInt();
                }
            }
            return arr;
        }
        protected long[][] nextLongMap (int rows, int columns) {
            long[][] arr = new long[rows][columns];
            for (int i=0; i<rows; i++) {
                for (int j=0; j<columns; j++) {
                    arr[i][j] = nextLong();
                }
            }
            return arr;
        }
        protected int nextInt() {return Integer.parseInt(next());}
        protected long nextLong() {return Long.parseLong(next());}
        protected double nextDouble() {return Double.parseDouble(next());}

        protected String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    /*
    static class Reader
    {
        final private int BUFFER_SIZE = 1<<26;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String nextLine() throws IOException
        {
            byte[] buf = new byte[1<<26];
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
        public String next() throws IOException
        {
            byte[] buf = new byte[1<<26];
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == ' ' || c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public long[] nextLongArr(int n) throws IOException
        {
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] nextIntArr(int n) throws IOException
        {
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        public Integer[] nextIntegerArray(int n) throws IOException
        {
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        public Long[] nextLongArray(int n) throws IOException
        {
            Long[] arr = new Long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
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
                ret = (ret<<3) + (ret<<1) + c - '0';
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
                ret = (ret<<3) + (ret<<1) + c - '0';
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
    */
    public static void main(String[] args) throws IOException {
        Reader in = new Reader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), h = in.nextInt();
        ArrayList<CustomPair<Integer, Integer>> al = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            al.add(new CustomPair<>(in.nextInt(), in.nextInt()));
        }
        al.sort(new Comparator<CustomPair<Integer, Integer>>() {
            @Override
            public int compare(CustomPair<Integer, Integer> o1, CustomPair<Integer, Integer> o2) {
                return -o1.getKey().compareTo(o2.getKey());
            }
        });
        int a_max = al.get(0).getKey();
        int num = 0;
        al.sort(new Comparator<CustomPair<Integer, Integer>>() {
            @Override
            public int compare(CustomPair<Integer, Integer> o1, CustomPair<Integer, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        boolean sf = false;
        for (int i=0; i<n; i++) {
            if (al.get(i).getValue()<a_max) break;
            h -= al.get(i).getValue();
            num++;
            if (h<=0) {
                sf = true;
                break;
            }
        }
        if (sf) out.printf("%d\n", num);
        else {
            num += (int)Math.ceil((double)h/(double)a_max);
            out.printf("%d\n", num);
        }
        out.close();
    }
}