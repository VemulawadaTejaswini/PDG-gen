import java.io.*;
import java.util.*;

public class Main {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
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
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextToken().toCharArray();
        }
        char[] t = in.nextToken().toCharArray();
        int pre = 0;
        int post = 0;
        int both = 0;
        for (int i = 0; i < n; i++) {
            int cmp = compare(s[i], t);
            if(cmp == 1) pre++;
            else if(cmp == 2) post++;
            else both++;
        }
        String ans = "";
        for (int i = pre; i <= pre + both; i++) {
            ans += (i + 1) + " ";
        }
        System.out.println(ans.trim());
    }

    final int BEFORE = 1;
    final int AFTER = 2;
    int compare(char[] s, char[] t) {
        int len = Math.min(s.length, t.length);
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if(s[i] == '?') {
                if(t[i] == 'a') flag |= AFTER;
                else if(t[i] == 'z') flag |= BEFORE;
                else return BEFORE | AFTER;
            } else {
                if(t[i] < s[i]) {
                    flag |= AFTER;
                    return flag;
                }
                else if(t[i] > s[i]) {
                    flag |= BEFORE;
                    return flag;
                }
            }
        }
        if(flag == 0) {
            if(s.length < t.length) return BEFORE;
            else if(s.length > t.length) return AFTER;
            else flag = BEFORE | AFTER;
        }
        return flag;
    }
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Long>{
    @Override public Long get(Object key){return containsKey(key)?super.get(key):0L;}
    public void add(T key,long v){put(key,get(key)+v);}
    public void add(T key){put(key,get(key)+1);}
    public void sub(T key){final long v=get(key);if(v==1)remove(key);else put(key,v-1);}
    public MultiSet<T> merge(MultiSet<T> set)
    {MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
        for(Entry<T,Long>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
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
