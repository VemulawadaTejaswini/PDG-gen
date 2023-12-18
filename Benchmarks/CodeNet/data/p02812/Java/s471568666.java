import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    int N;
    String S;
    int solve(){
        String[] ss = S.split("ABC");
        int c = 0;
        for(String s : ss){
            c += s.length();
        }

        return (N - c)/3;
    }

    public void _main() throws Exception {
        //System.setIn(new FileInputStream("/home/zxt/workspace/contest/inputs/b.in"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        S = in.readLine();
        System.out.println(solve());
    }

    public static void main(String[] args) throws Exception {
        Main s = new Main();
        s._main();
    }
}