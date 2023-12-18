import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        HashSet<Integer> kinds = new HashSet<>();
        int red = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();

            if (value <= 399) {
                kinds.add(0);
            } else if (value <= 799) {
                kinds.add(1);
            } else if (value <= 1199) {
                kinds.add(2);
            } else if (value <= 1599) {
                kinds.add(3);
            } else if (value <= 1999) {
                kinds.add(4);
            } else if (value <= 2399) {
                kinds.add(5);
            } else if (value <= 2799) {
                kinds.add(6);
            } else if (value <= 3199) {
                kinds.add(7);
            }
            if (3200 <= value) {
                red++;
            }
        }

        int min = kinds.size();
        int max = Math.min(kinds.size() + red, 8);
        System.out.println(min + " "+ max);
    }
}