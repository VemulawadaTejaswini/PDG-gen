import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
    }
    void solve() throws IOException {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<3;i++) set.add(sc.nextInt());
        String ans = set.size()==2?"Yes":"No";
        System.out.println(ans);
    }
}

