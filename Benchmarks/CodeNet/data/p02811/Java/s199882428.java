import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    int K, X;
    String solve(){
        if(K * 500 >= X) return "Yes";
        return "No";
    }

    public void _main() throws Exception {
        //System.setIn(new FileInputStream("/home/zxt/workspace/contest/inputs/a.in"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = in.readLine().split("[ \t]+");
        K = Integer.parseInt(ss[0]);
        X = Integer.parseInt(ss[1]);

        System.out.println(solve());
    }

    public static void main(String[] args) throws Exception {
        Main s = new Main();
        s._main();
    }
}