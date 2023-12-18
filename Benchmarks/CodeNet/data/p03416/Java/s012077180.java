import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        for (int i = A; i <= B; i++) {
            if (i / (int) Math.pow(10, 4) == i % 10 && i / 10 % 10 == i % (int) Math.pow(10, 4) / 1000) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
