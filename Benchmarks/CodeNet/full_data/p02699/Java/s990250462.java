import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        int w, s;
        s = in.nextInt();
        w = in.nextInt();

        System.out.println( (w >= s) ? "unsafe" : "safe" );

    }

}
