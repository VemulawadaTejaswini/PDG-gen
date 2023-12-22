import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Integer> p = new ArrayList<>();
        int[] yaku = new int[1000000];
        Arrays.fill(yaku, 0);

        for (int i = 0; i < N; i++) {
            int pi = sc.nextInt();
            p.add(pi);
            if (yaku[pi] != 0) {
                yaku[pi] = 2;
            }
            for (int j = pi; j < N; j += pi) {
                yaku[j]++;
            }
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (yaku[p.get(i)] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
