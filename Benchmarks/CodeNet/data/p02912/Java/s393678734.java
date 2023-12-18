import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        long result = 0;
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            result += a.get(i);
        }

        Collections.sort(a, Collections.reverseOrder());
        for (int i = m; i < n; i++) {
            a.remove(m);
        }
        for (int i = 0; i < m; i++) {
            int amount = a.get(0) / 2;
            result -= (a.get(0) - amount);
            a.set(0, amount);
            Collections.sort(a, Collections.reverseOrder());
        }

        System.out.println(result);
    }
}
