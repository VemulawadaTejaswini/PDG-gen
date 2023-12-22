import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                int tmp = sc.nextInt();
                list.set(tmp - 1, 1);
            }
        }

        int ans = 0;
        for (int x : list) {
            ans += x;
        }

        System.out.println(n - ans);
    }
}