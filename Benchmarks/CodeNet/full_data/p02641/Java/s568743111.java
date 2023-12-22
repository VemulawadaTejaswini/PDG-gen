import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<Integer>();
    static int x = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (!(list.contains(x))) {
            System.out.println(x);
        } else {
            System.out.println(dfs(1));
        }
    }

    private static int dfs(int n) {
        if (!(list.contains(x - n))) {
            return x - n;
        } else if (!(list.contains(x + n))) {
            return x + n;
        }
        return dfs(++n);
    }
}