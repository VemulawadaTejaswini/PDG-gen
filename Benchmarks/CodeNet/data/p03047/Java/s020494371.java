
import java.io.FileInputStream;
import java.util.*;

public class Main {
    int n,k;
    void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        System.out.println(n -k +1);

    }

    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("inputs/a.in"));
        Main s = new Main();
        s.solve();
    }
}
