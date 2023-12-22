import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> p = new ArrayList<>();
        for (long i = 0; i < N; i++) {
            p.add(sc.nextLong());
        }
        sc.close();

        Collections.sort(p);

        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean flg = true;

            for (int j = 0; j < N; j++) {
                if (p.get(j) > p.get(i)) {
                    break;
                }
                if (i == j) {
                    continue;
                }
                if (p.get(i) % p.get(j) == 0) {
                    flg = false;
                    break;
                }
            }

            if (flg) {
                count++;
            }
        }

        System.out.println(count);
    }
}
