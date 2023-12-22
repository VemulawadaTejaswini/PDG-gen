import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();

        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if (temp < X) {
                smaller.add(temp);
            } else {
                bigger.add(temp);
            }
        }

        scanner.close();

        Collections.sort(smaller);
        Collections.reverse(smaller);
        Collections.sort(bigger);

        int small = -1;
        int big = -1;
        for (int i = 0; i < smaller.size(); i++) {
            if (X - 1 - i != smaller.get(i)) {
                small = X - 1 - i;
                break;
            }
        }

        for (int i = 0; i < bigger.size(); i++) {
            if (X + i != bigger.get(i)) {
                big = X + i;
                break;
            }
        }

        if (bigger.size() > 0 && smaller.size() > 0) {
            if (small == -1) {
                small = smaller.get(smaller.size() - 1) - 1;
            }
            if (big == -1) {
                big = bigger.get(bigger.size() - 1) + 1;
            }

            if (X - small < big - X) {
                System.out.println(small);
            } else if (X - small > big - X) {
                System.out.println(big);
            } else {
                System.out.println(small);
            }
        } else if (bigger.size() == 0) {
            System.out.println(X);
        } else if (smaller.size() == 0) {
            if (bigger.contains(X)) {
                System.out.println(X - 1);
            } else {
                System.out.println(X);
            }
        }

    }
}
