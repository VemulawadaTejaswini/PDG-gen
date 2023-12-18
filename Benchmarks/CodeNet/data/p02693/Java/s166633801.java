import javafx.beans.binding.StringBinding;

import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long[] res;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    String solve(){
        int k = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%k==0) return "OK";
        }
        return "NG";
    }
}

