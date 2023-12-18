

import java.util.Scanner;

public class Main {

    static StringBuilder builder_ = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        builder_.append(scan.next());
        int totalQueryCount = Integer.parseInt(scan.next());

        boolean isReverse = false;
        for (int i = 0; i < totalQueryCount; i++) {
            int query1 = Integer.parseInt(scan.next());
            if (query1 == 1) {
                if (isReverse) {
                    isReverse = false;
                } else {
                    isReverse = true;
                }
            } else {
                int query2 = Integer.parseInt(scan.next());
                String query3 = scan.next();
                if (query2 == 1) {
                    t2f1(query3, isReverse);
                } else {
                    t2f2(query3, isReverse);
                }
            }
        }

        if (isReverse) {
            builder_.reverse();
        }

        System.out.println(builder_.toString());
        scan.close();
    }

    public static void t2f1(String input, boolean isReverse) {
        if (!isReverse) {
            builder_.insert(0, input);
        } else {
            builder_.append(input);
        }
    }

    public static void t2f2(String input, boolean isReverse) {
        if (!isReverse) {
            builder_.append(input);
        } else {
            builder_.insert(0, input);
        }
    }

}
