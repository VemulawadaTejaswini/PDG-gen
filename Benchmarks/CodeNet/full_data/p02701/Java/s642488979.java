
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        HashSet<String> set = new HashSet<>();
        int n;
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            set.add(in.next());
        }

        System.out.println(set.size());
    }
}
