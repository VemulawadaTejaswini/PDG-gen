import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int sum = sc.nextInt() + sc.nextInt();
        if (sum >= 10) System.out.println("error");
        else System.out.println(sum);
    }
}