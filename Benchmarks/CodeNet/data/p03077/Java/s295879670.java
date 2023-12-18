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
        long bottleNeckCount = 0;
        for (int i = 0; i < 5; i++) {
            long target = abcde.get(i);
            if (target > n) {
                continue;
            }
            if (bottleNeckCount == 0 || n / target + 1 > bottleNeckCount) {
                bottleNeckCount = n / target;
            }
        }
        System.out.println(5 + bottleNeckCount);
    }

}
