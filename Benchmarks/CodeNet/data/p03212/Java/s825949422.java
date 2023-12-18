import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static long n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        sc.close();

        ArrayList<Long> list = new ArrayList<>();

        dfs(list, 0);

        Iterator<Long> itr = list.iterator();

        while (itr.hasNext()) {
            String s = itr.next().toString();
            if (!(s.contains("3") && s.contains("5") && s.contains("7"))) {
                itr.remove();
            }
        }

        System.out.print(list.size());
    }

    public static void dfs(ArrayList<Long> list, long x) {
        if (x <= n) {
            list.add(x);
        } else {
            return;
        }

        dfs(list, x * 10 + 3);
        dfs(list, x * 10 + 5);
        dfs(list, x * 10 + 7);
    }
}