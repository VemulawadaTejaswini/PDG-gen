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
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        while(true){
            C = C - B;
            if(C <= 0){
                System.out.println("Yes");
                break;
            }else{

            }
            A = A - D;
            if(A <= 0){
                System.out.println("No");
                break;
            }else{

            }
        }
    }
} 