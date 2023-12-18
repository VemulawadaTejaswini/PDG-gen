import java.io.*;
import java.util.*;

public class Main {

    static PrintStream out = System.out;

    static void solve(Scanner in) {

        int A = in.nextInt();
        int B = in.nextInt();
        int k = in.nextInt();
        int cur = 1;
        int i = 0;
        for (;i < k;) {
            if (A % cur == 0 && B % cur == 0){
                i++;
                cur++;
            }else cur++;
        }
        System.out.println(cur - 1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        solve(in);
    }
}