import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    int n = 0;
    List<Long> semiAns = new ArrayList<>();

    public void run() {
        n = sc.nextInt();
        dfs(0);
        long count = 0;
        for (Long semiAn : semiAns) {
            String s = semiAn.toString();
            if (s.contains("3") && s.contains("5") && s.contains("7")) {
                count++;
            }
        }
        System.out.println(count);
    }

    private void dfs(long x) {
        if (x > n) {
            return;
        }
        if (x != 0) {
            semiAns.add(x);
        }
        dfs(10 * x + 3);
        dfs(10 * x + 5);
        dfs(10 * x + 7);
    }
}