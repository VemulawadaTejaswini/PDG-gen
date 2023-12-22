import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m == 2) {
            int first = 0;
            int second = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (i % 2 == 0) {
                    if (x == 1) {
                        second++;
                    } else {
                        first++;
                    }
                } else {
                    if (x == 1) {
                        first++;
                    } else {
                        second++;
                    }
                }
            }
            System.out.println(Math.min(first, second));
        } else {
            int prev = sc.nextInt();
            int count = 0;
            for (int i = 1; i < n; i++) {
                int x = sc.nextInt();
                if (prev == x) {
                    count++;
                    prev = 0;
                } else {
                    prev = x;
                }
            }
            System.out.println(count);
        }
    }
}

