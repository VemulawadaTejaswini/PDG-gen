import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
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
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] ans = new char[n][m];
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = '.';
            }
        }
        int y = 0;
        int x = 0;
        if(n % 2 == 1) {
            y++;
            for (int i = 0; i < m; i+=2) {
                ans[0][i] = '<';
                ans[0][i + 1] = '>';
                a--;
            }
        }
        if(m % 2 == 1) {
            for (int i = 0; i < n; i+=2) {
                ans[i][m - 1] = '^';
                ans[i + 1][m - 1] = 'v';
                b--;
            }
        }
//        n = (n / 2) * 2;
//        m = (m / 2) * 2;
        if((n / 2) * (m / 2) < (a + 1) / 2 + (b + 1) / 2) {
            System.out.println("NO");
            return;
        }
        for (int i = y; i < n - 1; i+=2) {
            for (int j = 0; j < m - 1; j+=2) {
                if(a >= 2) {
                    ans[i][j] = '<';
                    ans[i][j+1] = '>';
                    ans[i + 1][j] = '<';
                    ans[i + 1][j + 1] = '>';
                    a -= 2;
                } else if(a > 0) {
                    ans[i][j] = '<';
                    ans[i][j+1] = '>';
                    a--;
                } else if(b >= 2) {
                    ans[i][j] = '^';
                    ans[i][j+1] = '^';
                    ans[i + 1][j] = 'v';
                    ans[i + 1][j + 1] = 'v';
                    b -= 2;
                } else {
                    ans[i][j] = '^';
                    ans[i+1][j] = 'v';
                    b--;
                }
            }
        }
        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            System.out.println(String.valueOf(ans[i]));
        }
    }
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
    @Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
    public void add(T key,int v){put(key,get(key)+v);}
    public void add(T key){put(key,get(key)+1);}
    public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
    public MultiSet<T> merge(MultiSet<T> set)
    {MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
        for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
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