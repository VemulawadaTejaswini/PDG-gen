

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] health = new long[n];
        long min1 = -1;
        long min2 = -1;
        for (int i = 0; i < n; ++i) {
            health[i] = scanner.nextLong();
        }
        min1 = Math.min(health[0], health[1]);
        min2 = Math.max(health[0], health[1]);
        for (int i = 2; i < n; ++i) {
            if (health[i] <= min1) {
                min2 = min1;
                min1 = health[i];
            } else if (health[i] >= min2) {

            } else {
                min2 = health[i];
            }
        }
        
     //   System.out.println("min1: " + min1 + " min2: " + min2);
        while (min1 >= 1 && min2 >= 1) {
            if (min1 > min2) {
                long tmp = min1;
                min1 = min2;
                min2 = tmp;
            }
            if (min2 % min1 == 0) {
                System.out.println(min1);
                return;
            }
            min2 = min2 % min1;
        }
        System.out.println(Math.min(min1, min2));


    }

}
