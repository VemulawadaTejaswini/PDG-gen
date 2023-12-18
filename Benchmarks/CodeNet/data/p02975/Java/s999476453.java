
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        if (n % 3 != 0) {
            System.out.println("No");
            return;
        }

        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
        if (set.size() > 3) {
            System.out.println("No");
            return;
        }

        if (set.size() <= 2) {
            if (set.contains(0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }

        Iterator<Integer> iterator = set.iterator();
        if ((iterator.next() ^ iterator.next()) == iterator.next()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
