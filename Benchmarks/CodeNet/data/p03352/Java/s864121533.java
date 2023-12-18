import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int x=(int)Math.sqrt(X);
        System.out.println((int)Math.pow(x,2.0));
    }
}