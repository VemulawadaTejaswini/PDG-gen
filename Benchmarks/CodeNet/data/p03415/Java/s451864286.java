import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String c[] = new String[3];
        c[0] = sc.next();
        c[1] = sc.next();
        c[2] = sc.next();
        for (int i = 0; i < 3; i++) {
            System.out.print(c[i].charAt(i));
        }
        System.out.println();
    }

}