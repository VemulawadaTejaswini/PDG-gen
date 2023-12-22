import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int INF = (int)Math.pow(10, 9);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(sc.nextInt());
        }
        if (!p.contains(X)) {
            System.out.println(X);
        } else {
            int dif = 1;
            while (p.contains(X + dif) && p.contains(X - dif)) {
                dif++;
            }
            int opt1 = INF;
            if (!p.contains(X + dif)) {
                opt1 = X + dif;
            }
            int opt2 = INF;
            if (!p.contains(X - dif)) {
                opt2 = X - dif;
            }
            System.out.println(Math.min(opt1, opt2));
        }
        sc.close();
    }
}