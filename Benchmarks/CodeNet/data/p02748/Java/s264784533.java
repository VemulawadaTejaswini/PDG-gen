import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int reizouko[] = new int[a];
        int densirenji[] = new int[b];

        int minReizouko = Integer.MAX_VALUE;
        int minDensirenji = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            reizouko[i] = sc.nextInt();
            if (minReizouko > reizouko[i] ) {
                minReizouko = reizouko[i];
            }
        }

        for (int i = 0; i < b; i++) {
            densirenji[i] = sc.nextInt();
            if (minDensirenji > densirenji[i] ) {
                minDensirenji = densirenji[i];
            }
        }

        int minValue = minReizouko + minDensirenji;

        for (int i = 0; i < m; i++) {
            int value = reizouko[sc.nextInt() - 1] + densirenji[sc.nextInt() - 1] - sc.nextInt();
            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.println(minValue);

    }


}