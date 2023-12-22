import java.util.*;

public class Main {
    public static final int[] coins = {
        1, 5, 10, 50, 100, 500
    };

    public static void main(String[] args) {
        int sum = 0;
        try(Scanner scn = new Scanner(System.in)) {
            for(int i = 0; i < coins.length; i++) {
                sum += coins[i] * scn.nextInt();
            }
        }
        System.out.println(sum < 1000 ? 0 : 1);
    }
}