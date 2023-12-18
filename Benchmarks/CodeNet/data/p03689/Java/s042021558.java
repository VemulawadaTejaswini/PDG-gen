
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;



public class Main {
    private static int getVal(int x) {
        if (x >= 0) return -(x+1);
        return -x-1;
    }
    private static int getS(int r,int c,int h,int [] [] S) {
        int ret = S[r][c];
        if (r >= h) ret -= S[r-h][c];
        return ret;
    }
    public static void main(String[] args) throws Exception {
        IO io ;
        try {
            io = new IO("in.in", null);
        } catch (IOException e) {
            io = new IO(null, null);
        }
        int H = io.getNextInt(),W = io.getNextInt();
        int h = io.getNextInt(),w = io.getNextInt();
        int s = 0;
        int [] [] G = new int[H][W];
        int [] [] sum = new int[H][W];
        for (int r = 0;r < h;r++)
            for (int c = 0;c < w-1;c++) {
                G[r][c] = 1;
                if(r == 0 && c == 0) G[r][c] = h*w;
                s += G[r][c];
                sum[r][c] = G[r][c];
                if (r > 0) sum[r][c] += sum[r-1][c];
            }
        for (int c = w-1;c < W;c++) {
            for (int r = 0;r+1 < h;r++) {
                G[r][c] = 1;
                s += G[r][c];
                sum[r][c] = G[r][c];
                if (r > 0) sum[r][c] += sum[r-1][c];
            }
            G[h-1][c] = getVal(s);
            s += G[h-1][c];
            int r = h-1;
            sum[r][c] = G[r][c];
            if (r > 0) sum[r][c] += sum[r-1][c];
            for (r = 0;r < h && c >= w-1;r++)
                s -= G[r][c - (w-1)];
        }
        for (int r = h;r < H;r++) {
            s = 0;
            for (int c = 0;c < w;c++)
                s += getS(r-1,c,h-1,sum);
            for (int c = 0;c+1 < w;c++){
                G[r][c] = 1;
                if (c==0) G[r][c] = h*w;
                s += G[r][c];
                sum[r][c] = G[r][c];
                if (r > 0) sum[r][c] += sum[r-1][c];
            }
            for (int c = w-1;c < W;c++) {
                G[r][c] = getVal(s);
                s += G[r][c];
                sum[r][c] = G[r][c];
                if (r > 0) sum[r][c] += sum[r-1][c];

                // remove c-(w-1)
                s -= getS(r,c-(w-1),h,sum);

                // add c+1
                if (c+1 < W)
                    s += getS(r-1,c+1,h-1,sum);
            }
        }
        int S = 0;
        for (int c = 0;c < W;c++)
            S += sum[H-1][c];
        if (S <= 0) {
            io.println("No");
//            for (int r = 0;r < H;r++){
//                for (int c = 0;c < W;c++) {
//                    System.err.print(G[r][c]);
//                    if (c==W-1) System.err.println();
//                    else System.err.print(" ");;
//                }
//            }
        }
        else {
            io.println("Yes");
            for (int r = 0;r < H;r++){
                for (int c = 0;c < W;c++) {
                    io.print(G[r][c]);
                    if (c==W-1) io.println("");
                    else io.print(" ");
                }
            }
        }
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