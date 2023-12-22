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
    long solve(){
        long x = sc.nextLong();
        long cur = 100;
        for(int i=1;i<=500000;i++){
            cur += cur/100;
            if(cur>=x) return i;
        }
        return 0;
    }
}

