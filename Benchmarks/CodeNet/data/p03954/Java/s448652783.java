import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {
    private static int n,N;
    private static int [] P,A;

    private static boolean valid(int x) {
        int pp = -1,p = -1,m = N/2;
        for (int i = 0;i < N;i++){
            A[i] = 0;
            if (P[i] >= x) A[i] = 1;
        }
        for (int i = 0;i < N;i++) {
            int v = A[i];
            if (p == v) {
                if (v == 1 && (i == m || i-1 == m)) return true;
                pp = p;
                p = v;
            }
            else {
                if (pp == v) {
                    if (v == 1 && (i-2 == m || i-1 == m || i == m)) return true;
                    pp = p = v;
                }
                else {
                    pp = p;
                    p = v;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        IO io = new IO(null, null);
        n = io.getNextInt();
        N = 2*n-1;
        P = new int[N];
        A = new int[N];
        for (int i = 0;i < N;i++)
            P[i] = io.getNextInt();

        int s = 1,e = N;
        while (s < e) {
            int m = s + (e-s+1)/2;
            if (valid(m)) s = m;
            else e = m-1;
        }
        io.println(s);
        io.close();
    }
}





class IO{
    private BufferedReader br;
    private StringTokenizer st;
    private PrintWriter writer;
    private String inputFile,outputFile;

    public boolean hasMore() throws IOException{
        if(st != null && st.hasMoreTokens()) return true;
        if(br != null && br.ready()) return true;
        return false;
    }
    public String getNext() throws FileNotFoundException, IOException{
        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String getNextLine() throws FileNotFoundException, IOException{
        return br.readLine().trim();
    }

    public int getNextInt() throws FileNotFoundException, IOException{
        return Integer.parseInt(getNext());
    }
    public long getNextLong() throws FileNotFoundException, IOException{
        return Long.parseLong(getNext());
    }

    public void print(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f" ,x);
    }
    public void println(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f\n" ,x);
    }
    public void print(Object o) throws  IOException{
        writer.print(o.toString());
    }

    public void println(Object o) throws  IOException{
        writer.println(o.toString());
    }
    public IO(String x,String y) throws FileNotFoundException, IOException{
        inputFile = x;
        outputFile = y;
        if(x != null) br = new BufferedReader(new FileReader(inputFile));
        else br = new BufferedReader(new InputStreamReader(System.in));
        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        else writer = new PrintWriter(new OutputStreamWriter(System.out));
    }

    protected void close() throws IOException{
        br.close();
        writer.close();
    }
    public void outputArr(Object [] A) throws IOException{
        int L = A.length;
        for (int i = 0;i < L;i++) {
            if(i > 0) writer.print(" ");
            writer.print(A[i]);
        }
        writer.print("\n");
    }
}
