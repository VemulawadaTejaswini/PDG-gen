import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = sc.nextInt();
        for (int j = 1; j < i; j++) {
            N--;
        }
        System.out.println(N);
    }
}
