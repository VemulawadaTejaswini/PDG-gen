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
        int N = Integer.parseInt(sc.next());
        String[] S = new String[N];
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            S[i] = sc.next();
        }
        for(int i = 0; i < N; i++){
            if(list.contains(S[i])){

            }else{
                list.add(S[i]);
            }
        }
        out.println(list.size());
        out.flush();
        
    }
} 