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

        Collections.sort(a);
        for (int i = 0; i < m; i++) {
            int amount = a.get(a.size() - 1) / 2;
            a.set(a.size() - 1, amount);
            Collections.sort(a);
            result -= a.get(a.size() - 1) % 2 == 0 ? amount : amount + 1;
        }

        System.out.println(result);
    }
}
