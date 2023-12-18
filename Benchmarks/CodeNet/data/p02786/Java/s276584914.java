import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        sc.close();
        long count = atackEnemy(H);

        System.out.println(count);
    }

    public static long atackEnemy(Long H) {
        if (H.equals(1L)) {
            return 1;
        } else {
            long newHp = H / 2;
            return 2 * atackEnemy(newHp) + 1;
        }
    }

}