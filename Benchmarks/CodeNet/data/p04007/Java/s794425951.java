
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {


    public static void main(String[] args) throws Exception{
        IO io = new IO(null,null);
        int H = io.getNextInt(),W = io.getNextInt();
        char [] [] G = new char[H][W];
        char [] [] R = new char[H][W];
        char [] [] B = new char[H][W];
        for (int i = 0;i < H;i++)
            G[i] = io.getNext().toCharArray();
        for (int i = 0;i < H;i++)
            for (int j = 0;j < W;j++) {
                R[i][j] = B[i][j] = G[i][j];
                if (i == 0) R[i][j] = '#';
                if (i == H-1) B[i][j] = '#';
                if (i > 0 && i < H-1) {
                    if (j%2 == 0) R[i][j] = '#';
                    else B[i][j] = '#';
                }
            }
        for (int i = 0;i < H;i++)
            for (int j = 0;j < W;j++) {
                char c = '.';
                if (R[i][j] == '#' && B[i][j] == '#') c = '#';
                if (c != G[i][j]) throw new Exception("not valid grids");
            }

        for (int i = 0;i < H;i++)
            io.println(new String(R[i]));

        io.println("");
        for (int i = 0;i < H;i++)
            io.println(new String(B[i]));
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
