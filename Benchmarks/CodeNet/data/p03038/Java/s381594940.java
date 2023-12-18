import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i=0; i < n; i++)
            a.add(sc.nextInt());

        Collections.sort(a);

        loop:
        for (int i=0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j=0; j < b; j++) {
                if (a.get(j) < c)
                    a.set(j, c);
                else
                    continue loop;
            }
            Collections.sort(a);
        }

        long ans = 0;
        for (int i : a)
            ans += i;
        System.out.println(ans);

    }
}
