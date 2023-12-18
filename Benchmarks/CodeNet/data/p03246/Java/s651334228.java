import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final Map<Integer, Integer> a = new HashMap<>();
        final Map<Integer, Integer> b = new HashMap<>();
        int aMaxCount = 0;
        int aMax2Count = 0;
        int bMaxCount = 0;
        int bMax2Count = 0;
        int aMax = 0;
        int aMax2 = 0;
        int bMax = 0;
        int bMax2 = 0;

        for (int i = 0; i < n; ++i) {
            int current = scanner.nextInt();
            if (i % 2 == 0) {
                int count = a.getOrDefault(current, 0) + 1;
                a.put(current, count);
                if (count >= aMaxCount) {
                    aMax2Count = aMaxCount;
                    aMax2 = aMax;
                    aMaxCount = count;
                    aMax = current;
                } else if (count >= aMax2Count && count < aMaxCount) {
                    aMax2Count = count;
                    aMax2 = current;
                }
            } else {
                int count = b.getOrDefault(current, 0) + 1;
                b.put(current, count);
                if (count >= bMaxCount) {
                    bMax2Count = bMaxCount;
                    bMax2 = bMax;
                    bMaxCount = count;
                    bMax = current;
                } else if (count >= bMax2Count && count < bMaxCount) {
                    bMax2Count = count;
                    bMax2 = current;
                }
            }
        }


        if (aMax != bMax) {
            System.out.println(n - aMaxCount - bMaxCount);
        } else {
            if (aMax == aMax2 && bMax != bMax2) {
                System.out.println(n - bMax2Count);

            } else if (aMax == aMax2 && bMax == bMax2) {
                System.out.println(n / 2);
            } else if (aMax != aMax2 && bMax == bMax2) {
                System.out.println(n - aMax2Count);
            } else {
                int change1 = n - aMaxCount - bMax2Count;
                int change2 = n - bMaxCount - aMax2Count;
                System.out.println(Math.min(change1, change2));
            }
        }


    }
}
