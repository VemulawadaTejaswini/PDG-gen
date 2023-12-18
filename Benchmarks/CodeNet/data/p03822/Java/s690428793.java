import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class Main {
    private static ArrayList<Integer> [] G;

    private static int dfs(int u) {
        int r = 0;
        ArrayList<Integer> aux = new ArrayList<>();
        for (int v : G[u])
            aux.add(1 + dfs(v));
        Collections.sort(aux);
        for (int x : aux) {
            if (x > r) r = x;
            else r++;
        }
        return r;
    }

    public static void main(String[] args) throws Exception {
        IO io = new IO(null, null);
        int n = io.getNextInt();
        int [] A = new int[n+1];

        for (int i = 2;i <= n;i++)
            A[i] = io.getNextInt();

        G = new ArrayList[n+1];
        for (int i = 1;i <= n;i++)
            G[i] = new ArrayList<>();

        for (int i = 2;i <= n;i++)
            G[A[i]].add(i);

        io.println(dfs(1));

        io.close();
    }

    private static final int onebillion7 = 1000000007;
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