import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        ArrayList<Integer> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            m.add(in.nextInt());
        }

        Collections.sort(m);

        int minimal = m.stream().mapToInt(value -> value).sum();
        int remaining = x - minimal;

        int additional = remaining / m.get(0);

        System.out.println(m.size() + additional);
    }
}
