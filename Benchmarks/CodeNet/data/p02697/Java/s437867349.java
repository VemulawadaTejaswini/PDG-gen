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
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve(){
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i=1;i<=m;i++){
            out.println(String.format("%d %d",i,n+1-i));
        }
        out.flush();
    }
}

