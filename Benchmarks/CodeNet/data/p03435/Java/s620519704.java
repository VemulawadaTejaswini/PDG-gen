import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        final String[] tasks = new String[]{"D","C","B","A"};
        for(final String task:tasks) {
            try {
                Class ca = Main.class.getClassLoader().loadClass(task);
                if (ca.getField("on").getInt(null) == 1) {
                    Object aTask = ca.newInstance();
                    Method m = ca.getMethod("S", null);
                    m.invoke(aTask, null);
                }
            } catch (Exception ex) { }
        }
    }

}

class A {
    public static int on = 1;

    public void run(){
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = ni();
            }
        }

        for(int i=1;i<3;i++){
            int r = -100000;
            for(int j=0;j<3;j++){
                if(r==-100000) {
                    r = a[i][j] - a[i - 1][j];
                }else if(r!=(a[i][j] - a[i - 1][j])){
                    pl("No");
                    return;
                }
            }
        }


        for(int j=1;j<3;j++){
            int r = -100000;
            for(int i=0;i<3;i++){
                if(r==-100000) {
                    r = a[i][j] - a[i][j-1];
                }else if(r!=(a[i][j] - a[i][j-1])){
                    pl("No");
                    return;
                }
            }
        }
        pl("Yes");






    }
    private InputReader in =  new InputReader(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    public void S(){run();out.close(); }
    public int ni(){return Integer.parseInt(in.ns());}
    public long nl(){return Long.parseLong(in.ns());}
    public String ns(){return in.ns();}
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



