import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, m;
        String[] input;
        while (true) {
            input = sc.nextLine().trim().split(" ");
            n = Integer.parseInt(input[0]);
            k = Integer.parseInt(input[1]);
            m = Integer.parseInt(input[2]);

            if (n == 0) break;
            List<Integer> clock = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                clock.add(i);
            }

            // Initial removal
            clock.remove(m-1);
            int idx = m-1;

            while (clock.size() > 1) {
                idx = (idx + k - 1) % clock.size();
                clock.remove(idx);
            }

            System.out.println(clock.get(0));
        }
    }
}