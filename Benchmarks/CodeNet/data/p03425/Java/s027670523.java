import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        new A().S();
    }

}

class A {
    public static int on = 1;
    // 0 for small , 1 for big ,  2 for stdin
    public static int mode = 2;


    public void run(){
        int n = ni();
        int m = 0;
        int a = 0;
        int r= 0;
        int c = 0;
        int h = 0;
        while(n-->0){
            String s = ns();
            if(s.startsWith("M")){
                m++;
            }
            if(s.startsWith("A")){
                a++;
            }
            if(s.startsWith("R")){
                c++;
            }
            if(s.startsWith("H")){
                h++;
            }
        }

        pl(m*a*r+m*a*h+m*r*h+a*r*h);





        }


    public static String dir = "C:\\Users\\qilu1\\Downloads\\";
    public static String si = dir+"D-small-attempt0.in";
    public static String so = dir+"rs.out";
    public static String bi = dir+"D-large.in";
    public static String bo = dir+"rb.out";
    public final String[] inputs = new String[]{si,bi};
    public final String[] outputs = new String[]{so,bo};

    void setInput(){ try{in = new InputReader(new FileInputStream(inputs[mode]));}catch(Exception e){}}
    void setOutput(){ try{out = new PrintWriter(new FileOutputStream(outputs[mode]));}catch(Exception e){}}
    private InputReader in =  new InputReader(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    public void S(){if(mode!=2){setInput();setOutput();}run();out.close(); }
    public int ni(){return Integer.parseInt(in.ns());}
    public long nl(){return Long.parseLong(in.ns());}
    public String ns(){return in.ns();}
    public char[] nsl(){return in.nsl().toCharArray();}
    public void p(Object obj){out.print(obj);}
    public void ps(Object obj){p(obj);p(" ");}
    public void pl(Object obj){out.println(obj);}
    public int gcd(int a,int b){ while( b != 0 ) { int t = a % b;a = b;b = t; } return a; }
}

class B {
    public static int on = 0;

    public void run(){

    }
}

class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String nsl(){
        try {
            return reader.readLine();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public String ns() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

}

class Util{

    // z[i] denotes the longest substring begin from i s[i..i+z[i]-1] matches s[0..z[i]-1]
    static int[] zFunction(String str){
        char[] s = str.toCharArray();
        int n = s.length;
        int[] z = new int[n];
        z[0] = n;
        int left = -1;
        int right = -1;
        for (int i = 1; i < n; i++) {
            z[i] = (i >= right) ? 0 : Math.min(right - i, z[i - left]);
            while (i + z[i] < n && s[z[i]] == s[i + z[i]]) ++z[i];
            if (i + z[i] > right) {
                left = i;
                right = i + z[i];
            }
        }
        return z;
    }

    // p[i] denotes the longest substring end from i s[i-z[i]+1..i] matches s[0..z[i]-1]
    static int[] prefixFunction(String str){
        char[] s = str.toCharArray();
        int n = s.length;
        int[] p = new int[n];
        //     p[0] = 1; this should be 0, because we can not use s[0..i] to match s[0..i]
        int k = 0;
        for (int i = 1; i < n; i++) {
            while (k > 0 && s[i] != s[k])
                k = p[k - 1];
            if (s[i] == s[k])
                ++k;
            p[i] = k;
        }
        return p;
    }


}