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

    public void run(){
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] A = new int[M];
        int result = N;
        for(int i = 0; i < M; i++){
            A[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < M; i++){
            result = result - A[i];
        }
        if(result < 0){
            result = -1;
        }
        out.println(result);
        out.flush();
    }

}