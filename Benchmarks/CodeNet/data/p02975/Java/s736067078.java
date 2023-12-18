import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] aList;

        HashSet<Long> checkset = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            aList = new long[N];
            for (int i = 0; i < N; i++) {
                aList[i] = sc.nextLong();
            }
        }
        //オールゼロ
        boolean c = false;
        for (long target : aList) {
            if (target != 0) {
                c = true;
                break;
            }
        }
        if (c != true) {
            System.out.println("Yes");
            return;
        }

        if (N % 3 != 0) {
            System.out.println("No");
            return;
        }
        for (Long l : aList) {
            checkset.add(l);
        }

        if (checkset.size() != 3 && checkset.size() != 2) {
            System.out.println("No");
            return;
        }

        List<Long> list = new ArrayList<>(3);
        for (Long l : checkset) {
            list.add(l);
        }

        if (checkset.size() == 3) {
            long l1 = list.get(0);
            long l2 = list.get(1);
            long l3 = list.get(2);
            if ((l1 ^ l2) != l3) {
                System.out.println("No");
                return;
            }
            for (long l : list) {
                int count = 0;
                for (long target : aList) {
                    if (l == target) {
                        count++;
                    }
                }
                if (count * 3 != N) {
                    System.out.println("No");
                    return;
                }
            }
        } else {
            long l1 = list.get(0);
            long l2 = list.get(1);
            if ((l1 ^ l2) != l2 && (l1 ^ l2) != l1) {
                System.out.println("No");
                return;
            }

            int count1 = 0;
            int count2 = 0;

            for (long target : aList) {
                if (l1 == target) {
                    count1++;
                } else if (l2 == target) {
                    count2++;
                }
            }

            if (!((count1 * 2) == count2 || (count2 * 2) == count1)) {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");
        return;
    }
}
