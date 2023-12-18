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
        int h = ni();
        int w = ni();
        if(h==1&&w==1){
            pl(0);
            return;
        }
        int zb = 0;
        List<String> l = new ArrayList<>();
        for(int i=0;i<h;i++){
            String s = ns();
            l.add(s);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='.'){
                    zb++;
                }
            }
        }
        int[][] v = new int[h][w];
        Queue<int[]> q =  new LinkedList<>();
        q.offer(new int[]{0,0});
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{-1,1,0,0};
        int k = 1;
        while(q.size()>0){
            Queue<int[]> nq =  new LinkedList<>();
            while(q.size()>0){
                int[] now = q.poll();
                for(int i=0;i<4;i++){
                    int nx = now[0]+dx[i];
                    int ny = now[1]+dy[i];
                    if(nx>=0&&nx<h&&ny>=0&&ny<w&&v[nx][ny]==0&&l.get(nx).charAt(ny)=='.'){
                        if(nx==h-1&&ny==w-1){
                            int yl = k+1;
                            pl(zb-yl);
                            return;
                        }
                        nq.offer(new int[]{nx,ny});
                        v[nx][ny] = 1;
                    }
                }


            }
            k++;
            q = nq;


        }
        pl(-1);









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



