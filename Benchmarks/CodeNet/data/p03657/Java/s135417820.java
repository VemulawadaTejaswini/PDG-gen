import java.util.*;

public class Main {
    Scanner in = new Scanner(System.in);
    public void solve() {
        int a = in.nextInt(), b = in.nextInt();
        if(a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
        		System.out.println("Possible");
        }else {
        		System.out.println("Impossible");
        }

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}