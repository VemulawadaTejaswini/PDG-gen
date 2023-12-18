import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> abcde = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            abcde.add(sc.nextLong());
        }
        long bottleNeckCount = 1;
        for (int i = 0; i < 5; i++) {
            long target = abcde.get(i);
            if (target >= n) {
                continue;
            }
            long ceil = (long) Math.ceil((double) n / target);
            if (bottleNeckCount == 1 || ceil > bottleNeckCount) {
                bottleNeckCount = ceil;
            }
        }
        System.out.println(bottleNeckCount + 4);
    }

}
