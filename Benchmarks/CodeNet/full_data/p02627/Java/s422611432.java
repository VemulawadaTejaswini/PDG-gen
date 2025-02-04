import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        IO io = new IO();
        Impl impl = new Impl();

        String s = io.next();
        char c = s.charAt(0);

        if (c >= 'A' && c <= 'Z') {
            io.write("A");
        } else {
            io.write("a");
        }
    }

    static class Impl {

        public int exec(int[] start, int[] end) {
            return 0;
        }
    }

    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // get a integer
            int a = sc.nextInt();
            // get two integers separated with half-width break
            int b = sc.nextInt();
            int c = sc.nextInt();
            // get a string
            String s = sc.next();
            // output
            System.out.println((a+b+c) + " " + s);
        }
    }
    
    static class IO {
        BufferedWriter bw;
        BufferedReader br;
        StringTokenizer st;

        public IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void write(String s) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }  
        }

        public void write(long value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int value) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(boolean b, String truev, String falsv) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(b ? truev : falsv);
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(int[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void write(long[] a, char sep) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                   sb.append(a[i]);
                   sb.append(sep);
                }
                sb.append("\n");
                bw.write(sb.toString());
                bw.flush();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
 
        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nIntA(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nLongA(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public double[] nDoubleA(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextDouble();
            }
            return a;
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
 
        public String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}