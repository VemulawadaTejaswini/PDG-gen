import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        double max = 0;
        int maxSalt = 0;
        int maxSaltWater = 100 * a;
        for (int i = 0; 100 * a * i <= f; i++) {
            int waterA = 100 * a * i;
            for (int j = 0; 100 * b * j + waterA <= f; j++) {
                int water = waterA + 100 * b * j;
                if (water == 0) continue;
                for (int k = 0; c * k + water <= f; k++) {
                    int saltC = c * k;
                    for (int l = 0; l * d + saltC + water <= f; l++) {
                        int salt = saltC + l * d;
                        if (salt * 100 > e * water) continue;
                        double g = salt * 100.0 / (water + salt);
                        if (g > max) {
                            max = g;
                            maxSalt = salt;
                            maxSaltWater = salt + water;
                        }
                    }
                }
            }
        }
        System.out.println(maxSaltWater + " " + maxSalt);
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}