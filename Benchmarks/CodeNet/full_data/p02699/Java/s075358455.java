import java.util.*;
import java.io.*;
 
public class Main implements Runnable{
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
        Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        out.flush();
    }
    public void run() {
        int S = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        if(S <= W){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
} 