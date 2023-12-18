import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long x = N;
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= (N / 2) + 1; ) {
            if (x % i == 0) {
                list.add(i);
                x /= i;
            } else {
                i++;
            }
        }

        if (list.isEmpty()) {
            System.out.println(N - 1);
            return;
        }

        long seki = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            seki *= list.get(i);
        }

        System.out.println(seki + list.get(list.size() - 1) - 2);
    }
}