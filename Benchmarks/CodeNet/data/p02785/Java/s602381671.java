import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        sc.close();

        int N = Integer.parseInt(line1[0]);
        int K = Integer.parseInt(line1[1]);

        long[] enemies = Arrays.asList(line2).stream().mapToLong(Long::parseLong).toArray();

        Arrays.sort(enemies);

        long res = 0;
        for (int i = N - 1; i >= 0; i--) {
            long hp = enemies[i];
            if (K > 0) {
                K--;
                continue;
            }
            res += hp;
        }

        System.out.println(res);
    }

}