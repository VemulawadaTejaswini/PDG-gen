import java.io.*;
        import java.math.*;
        import java.util.*;
        import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

    long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }



    PrintWriter out;
    InputReader sc;

    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);

        // credit goes to Stefan Dascalescu
        // https://www.youtube.com/watch?v=iYS8l9_A-vY

        int n=sc.nextInt();
        ArrayList<Node> open_close=new ArrayList<>();
        int onlyOpen=0,onlyClose=0;
        for (int i = 0; i <n ; i++) {
            String s=sc.next();
            int m=s.length();
            Stack<Character> st=new Stack<>();
            for (int j = 0; j <m ; j++) {
                if(s.charAt(j)=='(')st.push('(');
                else{
                    if(st.isEmpty())st.push(')');
                    else {
                        if(st.peek()=='(')st.pop();
                        else st.push(')');
                    }
                }
            }
            HashSet<Character> hs=new HashSet<>();
            for(char x:st){
                hs.add(x);
            }

            if(hs.size()==2){
                Node temp=new Node(0,0);
                for(char x:st){
                    if(x=='('){
                        temp.opening++;
                    }
                    else{
                        temp.closing++;
                    }
                }
                open_close.add(temp);
            }
            else if(hs.size()==1){
                if(st.peek()=='('){
                    onlyOpen+=st.size();
                }
                else{
                    onlyClose+=st.size();
                }
            }
        }

        Collections.sort(open_close, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.closing!=o2.closing){
                    return Integer.compare(o1.closing,o2.closing);
                }
                else{
                    return Integer.compare(o2.opening,o1.opening);
                }
            }
        });


       // out.println(onlyOpen+" "+onlyClose+" "+open_close);

        int total=onlyOpen;
        for(Node temp:open_close){
            total-=temp.closing;
            if(total<0){
                out.println("No");
                out.close();return;
            }
            total+=temp.opening;
        }

        if(total==onlyClose){
            out.println("Yes");
        }
        else{
            out.println("No");
        }

        out.close();
    }

    class Node{
        int opening,closing;

        public Node(int opening, int closing) {
            this.opening = opening;
            this.closing = closing;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "opening=" + opening +
                    ", closing=" + closing +
                    '}';
        }
    }

}